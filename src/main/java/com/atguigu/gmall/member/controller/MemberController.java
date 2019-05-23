package com.atguigu.gmall.member.controller;

import com.atguigu.gmall.member.bean.UmsMember;
import com.atguigu.gmall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;


    @RequestMapping("addUmsMember")
    @ResponseBody
    public String addUmsMember(@RequestBody UmsMember umsMember){
        memberService.addUmsMember(umsMember);
        return null;
    }

    @RequestMapping("removeBatchMemberById")
    @ResponseBody
    public int removeBatchMemberById(@RequestParam("memberId") List<String> memberId){
        int effect = memberService.removeBatchMemberById(memberId);
        return effect;
    }

    @RequestMapping("removeMemberById")
    @ResponseBody
    public int removeMemberById(String memberId){
        int effect = memberService.removeMemberById(memberId);
        return effect;
    }

    @RequestMapping("updateMemberById")
    @ResponseBody
    public int updateMemberById(@RequestBody UmsMember umsMember){
        int effect = memberService.updateMemberById(umsMember);
        return effect;
    }

    @RequestMapping("getAllMember")
    @ResponseBody
    public List<UmsMember> getAllMember(){
        List<UmsMember> umsMembers = memberService.getAllMember();
        return umsMembers;
    }

    @RequestMapping("getMemberById")
    @ResponseBody
    public UmsMember getMemberById(String memberId){
        UmsMember umsMember = memberService.getMemberById(memberId);
        return umsMember;
    }
}
