package com.example.mycloudcoupon.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description SmsSeckillSkuNotice的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsSeckillSkuNotice {
    private Long id;
    private Long memberId;
    private Long skuId;
    private Long sessionId;
    private java.sql.Date subcribeTime;
    private java.sql.Date sendTime;
    private boolean	 noticeType;
}
