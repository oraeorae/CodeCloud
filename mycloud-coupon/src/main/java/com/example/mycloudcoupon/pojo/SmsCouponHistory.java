package com.example.mycloudcoupon.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description SmsCouponHistory的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsCouponHistory {
    private Long id;
    private Long couponId;
    private Long memberId;
    private String memberNickName;
    private boolean	 getType;
    private java.sql.Date createTime;
    private boolean	 useType;
    private java.sql.Date useTime;
    private Long orderId;
    private Long orderSn;
}
