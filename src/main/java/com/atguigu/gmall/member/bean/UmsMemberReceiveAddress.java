package com.atguigu.gmall.member.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UmsMemberReceiveAddress implements Serializable {


    @Id
    private String id;
    private String memberId;
    private String name;
    private String phoneNumber;
    private int defaultStatus;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;

}
