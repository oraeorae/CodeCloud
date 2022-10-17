package com.example.mycloudorder.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description OmsOrderReturnApply的实体类
 * @date 2022-10-16
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OmsOrderReturnApply {
    private Long id;
    private Long order_id;
    private Long sku_id;
    private String order_sn;
    private java.sql.Date create_time;
    private String member_username;
    private java.math.BigDecimal return_amount;
    private String return_name;
    private String return_phone;
    private boolean	 status;
    private java.sql.Date handle_time;
    private String sku_img;
    private String sku_name;
    private String sku_brand;
    private String sku_attrs_vals;
    private Integer sku_count;
    private java.math.BigDecimal sku_price;
    private java.math.BigDecimal sku_real_price;
    private String reason;
    private String description述;
    private String desc_pics;
    private String handle_note;
    private String handle_man;
}
