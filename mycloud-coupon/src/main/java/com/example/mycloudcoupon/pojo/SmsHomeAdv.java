package com.example.mycloudcoupon.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description SmsHomeAdv的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsHomeAdv {
    private Long id;
    private String name;
    private String pic;
    private java.sql.Date startTime;
    private java.sql.Date endTime;
    private boolean	 status;
    private Integer clickCount;
    private String url;
    private String note;
    private Integer sort;
    private Long publisherId;
    private Long authId;
}
