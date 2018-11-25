package com.fh.api.admin.app.biz;

import com.fh.api.admin.app.mapper.IAppMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("appService")
public class AppServiceImpl implements IAppService {
    @Autowired
    private IAppMapper appMapper;
    @Override
    public String findAppSecret(String appKey) {
        return appMapper.findAppSecret(appKey);
    }
}
