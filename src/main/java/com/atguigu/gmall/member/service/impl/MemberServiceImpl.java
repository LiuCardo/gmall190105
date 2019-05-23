package com.atguigu.gmall.member.service.impl;

import com.atguigu.gmall.member.bean.UmsMember;
import com.atguigu.gmall.member.mapper.MemberMapper;
import com.atguigu.gmall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;

    @Override
    public List<UmsMember> getAllMember() {
        List<UmsMember> umsMembers = memberMapper.selectAll();
        return umsMembers;
    }

    @Override
    public void addUmsMember(UmsMember umsMember) {
        memberMapper.insert(umsMember);
    }

    @Override
    public UmsMember getMemberById(String memberId) {
        return memberMapper.selectByPrimaryKey(memberId);
    }

    @Override
    public int removeMemberById(String memberId) {
        return memberMapper.deleteByPrimaryKey(memberId);
    }

    @Override
    public int removeBatchMemberById(List<String> memberId) {

        Example example = new Example(UmsMember.class);
        example.createCriteria().andIn("id",memberId);

        return memberMapper.deleteByExample(example);
    }

    @Override
    public int updateMemberById(UmsMember umsMember) {
        return memberMapper.updateByPrimaryKey(umsMember);
    }


}
