package com.fh.api.admin.member.mapper;

import com.fh.api.admin.member.po.Member;
import com.fh.api.admin.util.ServerResponse;

public interface IMemberMapper {
    public ServerResponse addMember(Member member);
}
