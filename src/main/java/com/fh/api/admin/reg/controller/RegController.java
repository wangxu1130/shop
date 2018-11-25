package com.fh.api.admin.reg.controller;

import com.fh.api.admin.common.SystemEnum;
import com.fh.api.admin.reg.biz.IRegService;
import com.fh.api.admin.reg.po.Member;
import com.fh.api.admin.util.ServerResponse;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping
@Api("会员注册")
public class RegController {
    @Resource
    private IRegService regService;
    @RequestMapping(value = "reg/reguser",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse reguser(Member member){
        regService.reguser(member);
        return ServerResponse.success(SystemEnum.SECCESS_ENUM);
   }
}
