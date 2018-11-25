package com.fh.api.admin.common;

public enum SystemEnum {

    SECCESS_ENUM(200,"ok"),
    ERROR_ENUM(500,"error"),
    USER_PASS_ERROR(2,"密码错误"),
    PHONE_CODE_ERROR(3000,"验证码错误"),
    SMS_CODE_TIMEOUT(2001,"验证码超时"),
    SMS_CODE_ERROR(2002,"验证码错误"),
    PHONE_CODE_IS_EMPTY(3001,"请输入验证码"),
    PHONE_CODE_TIMEOUT(3002,"验证码失效,请重新发送"),
    USER_NAME_EXITS(4000,"用户名已存在"),
    USER_NAME_IS_EMPTY(4001,"请输入用户名"),
    HEADER_IS_EMPTY(5000,"头信息为空"),
    HEADER_TIME_OUT(5001,"请求超时"),
    TOKEN_IS_ERROR(5002,"非法访问"),
    APPKEY_IS_ERROR(5003,"无效的appKey"),
    SMS_MOBILE_EMPTY(2000,"手机号为空"),
    SECKILL_MOBILE_INVALIDATE(2001,"手机号不合法");

    private int     code;
    private String  msg;
    private SystemEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}




