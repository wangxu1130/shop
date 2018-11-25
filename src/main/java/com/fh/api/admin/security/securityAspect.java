package com.fh.api.admin.security;

import com.fh.api.admin.app.biz.IAppService;
import com.fh.api.admin.common.SystemEnum;
import com.fh.api.admin.util.CheckSumBuilder;
import com.fh.api.admin.util.RedisUtil;
import com.fh.api.admin.util.ServerResponse;
import com.fh.api.admin.util.WebContext;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class securityAspect {
    @Resource(name = "appService")
    private IAppService appService;
    private static final long EXPIRE = 60*1000;
    public Object validate(ProceedingJoinPoint pjp){
        //获取头信息
        HttpServletRequest request = WebContext.getRequest();
        String appKey = request.getHeader("appKey");
        String time = request.getHeader("time");
        String sign = request.getHeader("sign");
        String nonce = request.getHeader("nonce");
        //验证头信息
        if (StringUtils.isEmpty(appKey) || StringUtils.isEmpty(time) || StringUtils.isEmpty(sign) || StringUtils.isEmpty(nonce)){
            return ServerResponse.error(SystemEnum.HEADER_IS_EMPTY);
        }
        //验证是否超时
        long resultTime = Long.parseLong(time);
        if (resultTime + EXPIRE < System.currentTimeMillis()){
            return ServerResponse.error(SystemEnum.HEADER_TIME_OUT);
        }
        //保证用户 nonce 只能被访问一次
        boolean success = RedisUtil.setNexExpire(nonce, "1", 60);
        if (!success){
            return ServerResponse.error(SystemEnum.TOKEN_IS_ERROR);
        }
        //验证签名
        String appSecret = appService.findAppSecret(appKey);
        if (StringUtils.isEmpty(appSecret)){
            return ServerResponse.error(SystemEnum.APPKEY_IS_ERROR);
        }
        //服务器端根据appKey查询到的appSecret结合time,nonce生成签名
        String checkSum = CheckSumBuilder.getCheckSum(appSecret, time, nonce);
        //

        return null;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
