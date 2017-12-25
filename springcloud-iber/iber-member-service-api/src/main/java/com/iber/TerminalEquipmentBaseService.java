package com.iber;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.iber.util.CommonVo;
import com.iber.util.Constant;
import com.iber.util.ParamVo;
import com.iber.util.PropertyUtil;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MultivaluedMap;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class TerminalEquipmentBaseService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TerminalEquipmentBaseService.class);

	// 出问题了，请稍后重试vo
	protected static final CommonVo FAIL_VO = Constant.FAIL_VO;
	// 请求参数字段错误vo
	protected static final CommonVo PARAM_FILED_VO = Constant.PARAM_FILED_VO;
	// 请求参数字段错误vo
	protected static final CommonVo PARAM_VO = Constant.PARAM_VO;
	// 请求参数必填字段为空vo
	protected static final CommonVo PARAM_REQUIRED_VO = Constant.PARAM_REQUIRED_VO;
	// token校验失败
	protected static final CommonVo TOKEN_VO = Constant.TOKEN_VO;
	// token校验失败
	protected static final CommonVo TO_LOGIN_VO = Constant.TO_LOGIN_VO;

	protected static final String CDN_ENDPOINT= PropertyUtil.getString("cdn.endpoint");
	protected static final String CDN_ACCESS_KEY_ID=PropertyUtil.getString("cdn.accessKeyId");
	protected static final String CDN_ACCESS_KEY_SECRET=PropertyUtil.getString("cdn.accessKeySecret");
	protected static final String CDN_BUCKET_NAME=PropertyUtil.getString("cdn.bucketName");
	protected static final String CDN_DNS=PropertyUtil.getString("cdn.dns");

	/**
	 * 解析前端传人的JSON字符串
	 * @return
	 */
	protected Map<String, String> parseJSON(String jsonText){
		Map<String, String> paramData  = new HashMap<String, String>();
		JSONObject jsonObject = JSONObject.parseObject(jsonText);
		Set<String> set = jsonObject.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			String key = iter.next();
			String value = jsonObject.getString(key);
			paramData.put(key, value);
		}
		return paramData;
	}
	
	protected Vector<String> getDescField(){
		Vector<String> descFields = new  Vector<String>();
		descFields.addElement("cid");
		descFields.addElement("memberId");
		descFields.addElement("method");
		descFields.addElement("param");
		descFields.addElement("phone");
		descFields.addElement("type");
		descFields.addElement("version");
		return descFields;
	}
	
	protected Vector<String> getSrcField(Map<String, String> map){
		Vector<String> field = new  Vector<String>();
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			field.add(iter.next());
		}
		return field;
	}
	
	/**
	 * 检查参数是否正确
	 * @param srcFields
	 * @param descFields
	 * @return
	 */
	protected boolean checkParam(Vector<String> srcFields, Vector<String> descFields){
		if(srcFields.isEmpty()) return false;
		if(descFields.isEmpty()) return false;
		if(!srcFields.isEmpty() && !descFields.isEmpty()){
			  if(srcFields.size() != descFields.size() ){
				  return false;
			  }
			  Collections.sort(srcFields);
			  Collections.sort(descFields);
              for(int i=0; i<srcFields.size(); i++){
            	  if(!srcFields.get(i).equals(descFields.get(i))){
            		  return false;
            	  }
              }
		}
		return true;
	}
	
	protected ParamVo getParamVo(Map<String, String> map){
		ParamVo vo = new ParamVo();
		vo.setCid(map.get("cid"));
		vo.setMemberId(map.get("memberId"));
		vo.setMethod(map.get("method"));
		vo.setParam(map.get("param"));
		vo.setPhone(map.get("phone"));
		vo.setType(map.get("type"));
		vo.setVersion(map.get("version"));
		return vo;
	}
	
	protected String objectToJson(Object obj) {
		JSONObject json = new JSONObject();
		try {
			
			Class<?> clz = obj.getClass();  
			Field[] fields = clz.getDeclaredFields();
			for (Field field : fields) {
				Method m = (Method) obj.getClass().getMethod("get" + field.getName().substring(0, 1).toUpperCase()
						+ field.getName().substring(1, field.getName().length()));  
				Object objValue = m.invoke(obj);
				json.put(field.getName(), objValue);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json.toString();
	}
	
//	protected void writeFile(byte[] content) throws IOException {  
//	   
// File file = new File("G:/p/tst.jpg");  
//
// if (!file.exists()) {  
//     file.createNewFile();  
// }  
//
// FileOutputStream fop = new FileOutputStream(file);  
//
// fop.write(content);  
// fop.flush();  
// fop.close();  
//
//} 
	
	/**
	 * header sample
	 * {
	 * 		Content-Type=[image/png], 
	 * 		Content-Disposition=[form-data; name="file"; filename="filename.extension"]
	 * }
	 **/
	//get uploaded filename, is there a easy way in RESTEasy?
	protected String getFileName(MultivaluedMap<String, String> header) {
		Set<String> set = header.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			String key = iter.next();
			System.out.println("========= "+key+"===============");
			List<String> list = header.get(key);
			for(String s : list){
				System.out.println(s);
			}
			System.out.println("================================");
		}
		
		String[] contentDisposition = header.getFirst("Content-Disposition").split(";");
		
		for (String filename : contentDisposition) {
			if ((filename.trim().startsWith("filename"))) {

				String[] name = filename.split("=");
				
				String finalFileName = name[1].trim().replaceAll("\"", "");
				return finalFileName;
			}
		}
		return "unknown";
	}
	
	
	protected Map<String,String> alipayParseParam(HttpServletRequest request){
		Map<String,String> params = new HashMap<String,String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			//乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
			//valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
			params.put(name, valueStr);
		}
		return params;
	}
	
	protected Map<String, String> weixinParseParam(HttpServletRequest request) throws Exception {
		// 解析结果存储在HashMap
		Map<String, String> map = new HashMap<String, String>();
		InputStream inputStream = request.getInputStream();
		// 读取输入流
		SAXReader reader = new SAXReader();
		org.dom4j.Document document = reader.read(inputStream);
		// 得到xml根元素
		org.dom4j.Element root = document.getRootElement();
		// 得到根元素的所有子节点
		List<org.dom4j.Element> elementList = root.elements();
		// 遍历所有子节点
		for (org.dom4j.Element e : elementList)
			map.put(e.getName(), e.getText());
		// 释放资源
		inputStream.close();
		inputStream = null;
		return map;
	}
	
	/**
	 * 获取请求参数中所有的信息
	 * 
	 * @param request
	 * @return
	 */
	public static Map<String, String> getACPAllRequestParam( HttpServletRequest request) {
		Map<String, String> res = new HashMap<String, String>();
		Enumeration<?> temp = request.getParameterNames();
		if (null != temp) {
			while (temp.hasMoreElements()) {
				String en = (String) temp.nextElement();
				String value = request.getParameter(en);
				res.put(en, value);
				//在报文上送时，如果字段的值为空，则不上送<下面的处理为在获取所有参数数据时，判断若值为空，则删除这个字段>
				//System.out.println("ServletUtil类247行  temp数据的键=="+en+"     值==="+value);
				if (null == res.get(en) || "".equals(res.get(en))) {
					res.remove(en);
				}
			}
		}
		return res;
	}
	
	
	public static Map<String, String> getApplePayAllRequestParam( HttpServletRequest request) {
		Map<String, String> res = new HashMap<String, String>();
		Enumeration<?> temp = request.getParameterNames();
		if (null != temp) {
			while (temp.hasMoreElements()) {
				String en = (String) temp.nextElement();
				String value = request.getParameter(en);
				res.put(en, value);
				//在报文上送时，如果字段的值为空，则不上送<下面的处理为在获取所有参数数据时，判断若值为空，则删除这个字段>
				//System.out.println("ServletUtil类247行  temp数据的键=="+en+"     值==="+value);
				if (null == res.get(en) || "".equals(res.get(en))) {
					res.remove(en);
				}
			}
		}
		return res;
	}


	/**
	 * 输出json字符串
	 *
	 * @param commonVo
	 * @return
	 **/
	protected String toJSONString(CommonVo commonVo) {
		return JSONObject.toJSONString(commonVo, SerializerFeature.WriteNullNumberAsZero, SerializerFeature.WriteMapNullValue);
	}

	/**
	 * 校验token
	 * @param request
	 * @param method
	 * @param serverToken
	 * @return
	 */
	protected boolean checkToken(final HttpServletRequest request, final String method, final String serverToken) {
		if(!StringUtils.isBlank(serverToken) && !serverToken.equalsIgnoreCase("offtoken") && !TerminalEquipmentInterface.getNotTokenData().contains(method)){
			String clientToken = request.getHeader("token");
			if(!serverToken.equals(clientToken)){
				return true;
			}
		}else{
			if(serverToken.equals("")&& !TerminalEquipmentInterface.getNotTokenData().contains(method)){
				return true;
			}
		}
		return false;
	}

	/**
	 * 错误输出
	 * @param log 日志
	 * @param e 异常
	 * @return
	 */
	/*protected String outErrorAndLog(ExceptionLog log, Exception e, ExceptionLogDsdbService logDsdbService) {
		String exceptionContext = e.toString();
		if (exceptionContext.length() > 500) {
			exceptionContext = exceptionContext.substring(0, 500);
		}
		LOGGER.error("业务异常！{}", exceptionContext);
		log.setExceptioncontent(exceptionContext);
		ExceptionLogThread thread = new ExceptionLogThread(logDsdbService, JSON.toJSONString(log));
		Executes.execute(thread);
		return toJSONString(FAIL_VO);
	}*/
}
