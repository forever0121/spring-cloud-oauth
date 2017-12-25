package com.iber.service.version;


import com.alibaba.fastjson.JSONObject;
import com.iber.mapper.version.APPVersionMapper;
import com.iber.util.CommonVo;
import com.iber.util.ParamVo;
import com.iber.util.ResultCode;
import com.iber.vo.version.QueryAPPVersionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class APPVersionServiceImpl implements APPVersionService{
	

	@Autowired
	private APPVersionMapper appVersionMapper;

	
	@Override
	@RequestMapping(value = "/queryAPPVersion", method = RequestMethod.POST)
	public CommonVo queryAPPVersion(@RequestBody ParamVo vo) {
//		ParamVo vo = JSONObject.parseObject(param, ParamVo.class);
		JSONObject jsonObject = JSONObject.parseObject(vo.getParam());
		Map<String,Object> paramMap = new HashMap<String, Object>() ;
		paramMap.put("appCategory",jsonObject.getString("appCategory")) ;
		paramMap.put("currentRecord",Integer.parseInt(jsonObject.getString("currentRecord")) + 1) ;
		paramMap.put("appType", "android");
		
		QueryAPPVersionVO queryAPPVersionVOList =appVersionMapper.queryAPPVersion(paramMap);
		CommonVo commonVo = new CommonVo(ResultCode.SUCCESS_CODE, "查询版本代数成功",queryAPPVersionVOList) ;
		return commonVo;
	}
}
