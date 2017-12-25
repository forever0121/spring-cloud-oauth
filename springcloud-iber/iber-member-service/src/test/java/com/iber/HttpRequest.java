package com.iber;

import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * Created by 刘晓杰 on 2017/12/15.
 */
public class HttpRequest {
    public static void main(String[] args) throws Exception{
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "http://127.0.0.1:8080/services/i/e/hi";
        HttpPost httpPost = new HttpPost(url);

        // 设置请求的header
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        JSONObject jsonParam = new JSONObject();
        jsonParam.put("id", "1");
        jsonParam.put("name", "1");

        StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        httpPost.setEntity(entity);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);
        String json2 = EntityUtils.toString(response.getEntity(), "utf-8");
        JSONObject jsonObject = JSONObject.fromObject(json2);

        // 打印执行结果
        System.out.println(jsonObject);
    }
}
