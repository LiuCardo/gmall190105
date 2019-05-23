package com.atguigu.gmall.member.service;

import com.atguigu.gmall.member.bean.UmsMember;
import com.atguigu.gmall.member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MemberService {

    List<UmsMember> getAllMember();

    void addUmsMember(UmsMember umsMember);

    UmsMember getMemberById(String memberId);

    int removeMemberById(String memberId);

    int removeBatchMemberById(List<String> memberId);

    int updateMemberById(UmsMember umsMember);
}
