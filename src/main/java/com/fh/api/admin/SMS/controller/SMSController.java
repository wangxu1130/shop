package com.fh.api.admin.SMS.controller;

import com.fh.api.admin.SMS.biz.ISmsService;
import com.fh.api.admin.util.ServerResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class SMSController {
    @Resource(name = "smsService")
    private ISmsService smsService;
    @RequestMapping(value = "/sms/send",method = RequestMethod.GET)
    public ServerResponse sendSMS(String mobile){

        return smsService.sendSMS(mobile);
    }
}
