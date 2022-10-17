package com.example.mycloudcoupon.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description SmsSkuFullReduction的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsSkuFullReduction {
    private Long id;
    private Long skuId;
    private java.math.BigDecimal fullPrice;
    private java.math.BigDecimal reducePrice;
    private boolean	 addOther;
}
