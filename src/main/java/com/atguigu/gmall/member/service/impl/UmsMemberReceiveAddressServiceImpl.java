package com.atguigu.gmall.member.service.impl;

import com.atguigu.gmall.member.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.member.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.member.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public int addReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        return umsMemberReceiveAddressMapper.insert(umsMemberReceiveAddress);
    }

    @Override
    public int removeReceiveAddressById(String id) {
        return umsMemberReceiveAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int removeBatchReceiveAddressById(List<String> ids) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andIn("id",ids);
        return umsMemberReceiveAddressMapper.deleteByExample(example);
    }

    @Override
    public int updateReceiveAddressById(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        return umsMemberReceiveAddressMapper.updateByPrimaryKey(umsMemberReceiveAddress);
    }

    @Override
    public UmsMemberReceiveAddress getReceiveAddressById(String id) {
        return umsMemberReceiveAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UmsMemberReceiveAddress> getAllReceiveAddress() {
        return umsMemberReceiveAddressMapper.selectAll();
    }
}
