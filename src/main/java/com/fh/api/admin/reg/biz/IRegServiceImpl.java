package com.fh.api.admin.reg.biz;

import com.fh.api.admin.reg.mapper.IRegMapper;
import com.fh.api.admin.reg.po.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IRegServiceImpl implements IRegService {
    @Autowired
    private IRegMapper regMapper;
    @Override
    public void reguser(Member member) {
        regMapper.reguser(member);
    }
}
