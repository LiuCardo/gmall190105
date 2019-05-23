package com.atguigu.gmall.member.service;

import com.atguigu.gmall.member.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService {

    int addReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);

    int removeReceiveAddressById(String id);

    int removeBatchReceiveAddressById(List<String> ids);

    int updateReceiveAddressById(UmsMemberReceiveAddress umsMemberReceiveAddress);

    UmsMemberReceiveAddress getReceiveAddressById(String id);

    List<UmsMemberReceiveAddress> getAllReceiveAddress();
}
