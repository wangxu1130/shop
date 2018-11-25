package com.fh.api.admin.list.biz;

import com.fh.api.admin.list.po.Goods;
import com.fh.api.admin.util.ServerResponse;

public interface IApiService {

    ServerResponse queryAll(Goods goods);
}
