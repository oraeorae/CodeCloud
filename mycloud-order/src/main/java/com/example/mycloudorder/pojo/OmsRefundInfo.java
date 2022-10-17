package com.example.mycloudorder.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description OmsRefundInfo的实体类
 * @date 2022-10-16
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OmsRefundInfo {
    private Long id;
    private Long order_return_id;
    private java.math.BigDecimal refund;
    private String refund_sn;
    private boolean	 refund_status;
    private Integer refund_channel;
    private String refund_content;
}
