package com.fh.api.admin.area.controller;

import com.fh.api.admin.area.biz.IAreaService;
import com.fh.api.admin.util.ServerResponse;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/area")
public class AreaController {
    @Resource(name = "areaService")
    private IAreaService areaService;


    @GetMapping("/list")
    public Object areaList(Integer id,String callback){
        System.out.println("4555555555555555555555555");
        ServerResponse areaList = areaService.findAreaList(id);
        System.out.println(callback+"124111111111111111111111");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(areaList);
        mappingJacksonValue.setJsonpFunction(callback);
        return mappingJacksonValue;
    }
}
