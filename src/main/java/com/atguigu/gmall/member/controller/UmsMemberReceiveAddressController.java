package com.atguigu.gmall.member.controller;

import com.atguigu.gmall.member.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.member.service.UmsMemberReceiveAddressService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UmsMemberReceiveAddressController {

    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @RequestMapping("addReceiveAddress")
    @ResponseBody
    public int addReceiveAddress(@RequestBody UmsMemberReceiveAddress umsMemberReceiveAddress){
        int effect = umsMemberReceiveAddressService.addReceiveAddress(umsMemberReceiveAddress);
        return effect;
    }

    @RequestMapping("removeReceiveAddressById")
    @ResponseBody
    public int removeReceiveAddressById(String id){
        int effect = umsMemberReceiveAddressService.removeReceiveAddressById(id);
        return effect;
    }

    @RequestMapping("removeBatchReceiveAddressById")
    @ResponseBody
    public int removeBatchReceiveAddressById(@RequestParam("ids") List<String> ids){
        int effect = umsMemberReceiveAddressService.removeBatchReceiveAddressById(ids);
        return effect;
    }

    @RequestMapping("updateReceiveAddressById")
    @ResponseBody
    public int updateReceiveAddressById(@RequestBody UmsMemberReceiveAddress umsMemberReceiveAddress){
        int effect = umsMemberReceiveAddressService.updateReceiveAddressById(umsMemberReceiveAddress);
        return effect;
    }

    @RequestMapping("getReceiveAddressById")
    @ResponseBody
    public UmsMemberReceiveAddress getReceiveAddressById(String id){
        UmsMemberReceiveAddress umsMemberReceiveAddress = umsMemberReceiveAddressService.getReceiveAddressById(id);
        return umsMemberReceiveAddress;
    }

    @RequestMapping("getAllReceiveAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAllReceiveAddress(){
        List<UmsMemberReceiveAddress> allUmsMemberReceiveAddress = umsMemberReceiveAddressService.getAllReceiveAddress();
        return allUmsMemberReceiveAddress;
    }

}
