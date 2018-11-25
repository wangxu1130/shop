package com.fh.api.admin.member.biz;

import com.fh.api.admin.common.SystemEnum;
import com.fh.api.admin.member.mapper.IMemberMapper;
import com.fh.api.admin.member.po.Member;
import com.fh.api.admin.util.RedisUtil;
import com.fh.api.admin.util.ServerResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("memberService")
public class MemberServiceImpl implements IMemberService{
    @Resource
    private IMemberMapper memberMapper;
    @Override
    public ServerResponse addMember(Member member) {
        String phone = member.getPhone();
        String phoneCode = member.getPhoneCode();
        String result = RedisUtil.get(phone);
        if (StringUtils.isEmpty(result)){
            return ServerResponse.error(SystemEnum.PHONE_CODE_IS_EMPTY);
        }
        if (!result.equals(phoneCode)){
            return ServerResponse.error(SystemEnum.PHONE_CODE_ERROR);
        }

        return memberMapper.addMember(member);
    }
}
