package com.example.mycloudauth.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberReceiveAddress的实体类
 * @date 2022-10-14
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsMemberReceiveAddress {
    private Long id;
    private Long member_id;
    private String name;
    private String phone;
    private String post_code;
    private String province;
    private String city;
    private String region;
    private String detail_address;
    private String areacode;
    private boolean	 default_status;
}
