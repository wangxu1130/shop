package com.fh.api.admin.area.biz;

import com.fh.api.admin.area.mapper.IAreaMapper;
import com.fh.api.admin.area.po.Area;
import com.fh.api.admin.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("areaService")
public class AreaServiceImpl implements IAreaService {
     @Resource
    private IAreaMapper areaMapper;
    @Override
    public ServerResponse findAreaList(Integer id) {
        List<Area> areaList = areaMapper.findAreaList(id);
        System.out.println(areaList);
        return ServerResponse.success(areaList);
    }
}
