package com.fh.api.admin.SMS.biz;

import com.fh.api.admin.common.SystemEnum;
import com.fh.api.admin.util.RedisUtil;
import com.fh.api.admin.util.ServerResponse;


import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

@Service("smsService")
public class SmsServiceImpl implements ISmsService {
    @Override
    public ServerResponse sendSMS(String mobile) {

        if (StringUtils.isEmpty(mobile)){
            return ServerResponse.error(SystemEnum.SMS_MOBILE_EMPTY);
        }
        if (mobile.length() != 11){
            return ServerResponse.error(SystemEnum.SECKILL_MOBILE_INVALIDATE);
        }
      /*  String result = SMSUtil.sendSMS(mobile);
        System.out.println(result);

        Gson gson = new Gson();
        Map resultMap = gson.fromJson(result,Map.class);
        int code = ((Double) resultMap.get("code")).intValue();
        String msg = (String) resultMap.get("msg");
        String msgCode = (String) resultMap.get("obj");


        if (code!= 200){
            return ServerResponse.error(-1,"调用网易云信接口失败"+msg);
        }*/

        //存入redis
        RedisUtil.set(mobile,"521120");
        //设置过期时间
        RedisUtil.expire(mobile,120);
        return ServerResponse.success();
    }
}
