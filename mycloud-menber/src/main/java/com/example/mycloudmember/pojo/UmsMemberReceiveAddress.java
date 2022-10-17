package com.example.mycloudmember.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberReceiveAddress的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsMemberReceiveAddress {
    private Long id;
    private Long memberId;
    private String name;
    private String phone;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;
    private String areacode;
    private boolean	 defaultStatus;
}
