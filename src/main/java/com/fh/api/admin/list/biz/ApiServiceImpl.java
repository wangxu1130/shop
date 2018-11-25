package com.fh.api.admin.list.biz;


import com.fh.api.admin.list.mapper.IApiMapper;
import com.fh.api.admin.list.po.Goods;
import com.fh.api.admin.util.ServerResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements IApiService {

    @Autowired
    private IApiMapper apiMapper;

    @Override
    public ServerResponse queryAll(Goods goods) {
        List<Goods> goodsList = apiMapper.queryAll(goods);
        return ServerResponse.success(goodsList);
    }
}
