package com.fh.api.admin.SMS.biz;


import com.fh.api.admin.util.ServerResponse;

public interface ISmsService {
    public ServerResponse sendSMS(String mobile);
}
