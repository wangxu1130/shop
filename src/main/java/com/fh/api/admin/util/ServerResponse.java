package com.fh.api.admin.util;

import com.fh.api.admin.common.SystemEnum;

import java.io.Serializable;

public class ServerResponse implements Serializable {

    private static final long serialVersionUID = -963026911940434396L;

    private int code;

    private String msg;

    private Object data;

    public ServerResponse(){

    }
    private ServerResponse(int code,String msg,Object data){
        this.code=code;
        this.msg = msg;
        this.data = data;
    }

    public static ServerResponse success(Object data){
        return new ServerResponse(SystemEnum.SECCESS_ENUM.getCode(), SystemEnum.SECCESS_ENUM.getMsg(), data);
    }
    public static ServerResponse success(){
        return new ServerResponse(SystemEnum.SECCESS_ENUM.getCode(), SystemEnum.SECCESS_ENUM.getMsg(), null);
    }
    public static ServerResponse error(int code,String message){
        return new ServerResponse(code, message,null);
    }
    public static ServerResponse error(){
        return new ServerResponse(SystemEnum.ERROR_ENUM.getCode(), SystemEnum.ERROR_ENUM.getMsg(),null);
    }
    public static ServerResponse error(SystemEnum systemEnum){
        return new ServerResponse(systemEnum.getCode(), systemEnum.getMsg(), null);
    }
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return msg;
    }
    public Object getData() {
        return data;
    }

}
