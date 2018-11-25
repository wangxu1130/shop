package com.fh.api.admin.list.controller;

import com.fh.api.admin.list.biz.IApiService;
import com.fh.api.admin.list.po.Goods;
import com.fh.api.admin.util.ServerResponse;

import io.swagger.annotations.Api;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Api("商品列表数据")
public class Apicontroller {

    @Resource
    private IApiService apiService;

    @GetMapping("/api/queryAll")
    public Object queryAll(String callback, Goods goods){
        ServerResponse goodsList = apiService.queryAll(goods);
        System.out.println(goodsList+"++++++++++++++++++++");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(goodsList);
        mappingJacksonValue.setJsonpFunction(callback);
        return mappingJacksonValue;
    }

}
