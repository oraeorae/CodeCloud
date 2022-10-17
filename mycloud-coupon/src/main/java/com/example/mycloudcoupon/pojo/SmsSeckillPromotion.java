package com.example.mycloudcoupon.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description SmsSeckillPromotion的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsSeckillPromotion {
    private Long id;
    private String title;
    private java.sql.Date startTime;
    private java.sql.Date endTime;
    private Integer status;
    private java.sql.Date createTime;
    private Long userId;
}
