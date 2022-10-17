package com.example.mycloudorder.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description OmsOrderItem的实体类
 * @date 2022-10-16
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OmsOrderItem {
    private Long id;
    private Long order_id;
    private String order_sn;
    private Long spu_id;
    private String spu_name;
    private String spu_pic;
    private String spu_brand;
    private Long category_id;
    private Long sku_id;
    private String sku_name;
    private String sku_pic;
    private java.math.BigDecimal sku_price;
    private Integer sku_quantity;
    private String sku_attrs_vals;
    private java.math.BigDecimal promotion_amount;
    private java.math.BigDecimal coupon_amount;
    private java.math.BigDecimal integration_amount;
    private java.math.BigDecimal real_amount;
    private Integer gift_integration;
    private Integer gift_growth;
}
