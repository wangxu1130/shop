package com.fh.api.admin.list.mapper;

import com.fh.api.admin.list.po.Goods;
import com.fh.api.admin.util.ServerResponse;

import java.util.List;

public interface IApiMapper {

    List<Goods> queryAll(Goods goods);
}
