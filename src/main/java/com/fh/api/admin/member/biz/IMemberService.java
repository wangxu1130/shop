package com.fh.api.admin.member.biz;

import com.fh.api.admin.member.po.Member;
import com.fh.api.admin.util.ServerResponse;

public interface IMemberService {
    public ServerResponse addMember(Member member);
}
