package com.fh.api.admin.util;

import com.fh.api.admin.common.SystemConst;
import org.apache.commons.lang.RandomStringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SMSUtil {
    public static String sendSMS(String mobile){
        Map params = new HashMap<>();
        params.put("mobile",mobile);
        params.put("templatced", SystemConst.TEMPLATCED);
        params.put("codeLen",SystemConst.CODELEN);

        Map headers = new HashMap<>();
        headers.put("AppKey",SystemConst.APPKEY);
        String nonce = RandomStringUtils.randomAlphanumeric(10);
        headers.put("nonce", nonce);
        String CurTime = new Date().getTime()+"";
        headers.put("CurTime",CurTime);
        headers.put("checkSum", CheckSumBuilder.getCheckSum(SystemConst.APPSECRET,nonce,CurTime));
        String result = HttpclientUtil.sendPost(SystemConst.SMSURL, params, headers);
        return result;
    }
}
