package com.example.mycloudorder.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description OmsPaymentInfo的实体类
 * @date 2022-10-16
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OmsPaymentInfo {
    private Long id;
    private String order_sn;
    private Long order_id;
    private String alipay_trade_no;
    private java.math.BigDecimal total_amount;
    private String subject;
    private String payment_status;
    private java.sql.Date create_time;
    private java.sql.Date confirm_time;
    private String callback_content;
    private java.sql.Date callback_time;
}
