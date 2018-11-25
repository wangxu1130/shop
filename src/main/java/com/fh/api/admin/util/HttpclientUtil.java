package com.fh.api.admin.util;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HttpclientUtil {
    public static String sendPost(String url, Map<String, String> params, Map<String, String> headers) {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(url);
        if (null != params && params.size() > 0) {
            Iterator<Map.Entry<String, String>> iterator = params.entrySet().iterator();
            List<NameValuePair> pairs = new ArrayList<>();
            while (iterator.hasNext()) {
                Map.Entry<String, String> next = iterator.next();
                String key = next.getKey();
                String value = next.getValue();
                pairs.add(new BasicNameValuePair(key, value));
            }
            try {
                UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(pairs, "utf-8");
                httpPost.setEntity(urlEncodedFormEntity);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        if (null != headers && headers.size() > 0) {
            Iterator<Map.Entry<String, String>> iterator = headers.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> next = iterator.next();
                String key = next.getKey();
                String value = next.getValue();
                httpPost.setHeader(key,value);
            }

        }
        CloseableHttpResponse response = null;
        String result = null;
        try {
            response = client.execute(httpPost);
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null != response){
                try {
                    response.close();
                    response=null;
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (null != httpPost){
                httpPost.releaseConnection();
            }
            if (null != client){
                try {
                    client.close();
                    client=null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
