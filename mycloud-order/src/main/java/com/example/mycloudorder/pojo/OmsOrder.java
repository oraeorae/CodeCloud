package com.example.mycloudorder.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description OmsOrder的实体类
 * @date 2022-10-16
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OmsOrder {
    private Long id;
    private Long member_id;
    private String order_sn;
    private Long coupon_id;
    private java.sql.Date create_time;
    private String member_username;
    private java.math.BigDecimal total_amount;
    private java.math.BigDecimal pay_amount;
    private java.math.BigDecimal freight_amount;
    private java.math.BigDecimal promotion_amount;
    private java.math.BigDecimal integration_amount;
    private java.math.BigDecimal coupon_amount;
    private java.math.BigDecimal discount_amount;
    private Integer pay_type;
    private Integer source_type;
    private Integer status;
    private Integer auto_confirm_day;
    private Integer integration;
    private Integer growth;
    private Integer bill_type;
    private String note;
    private Integer confirm_status;
    private Integer delete_status;
    private Integer use_integration;
    private java.sql.Date payment_time;
    private java.sql.Date delivery_time;
    private java.sql.Date receive_time;
    private java.sql.Date comment_time;
    private java.sql.Date modify_time;
}
