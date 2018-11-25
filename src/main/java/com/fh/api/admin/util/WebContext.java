package com.fh.api.admin.util;

import javax.servlet.http.HttpServletRequest;

public class WebContext {

    private static ThreadLocal<HttpServletRequest> requestLocal = new ThreadLocal<HttpServletRequest>();
    private static HttpServletRequest requset;

    //存值的方法
    public static void setRequest(HttpServletRequest request){
        requestLocal.set(request);
    }
    //取值的方法
    public static HttpServletRequest getRequest(){
        return requestLocal.get();
    }
    //删除方法
        public static void remove(){
        requestLocal.remove();
    }

    public static void setRequset(HttpServletRequest requset) {
        WebContext.requset = requset;
    }

    public static HttpServletRequest getRequset() {
        return requset;
    }

}
