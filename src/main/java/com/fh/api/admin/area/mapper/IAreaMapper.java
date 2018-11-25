package com.fh.api.admin.area.mapper;

import com.fh.api.admin.area.po.Area;

import java.util.List;

public interface IAreaMapper {

    public List<Area> findAreaList(Integer id);
}
