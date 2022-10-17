package com.example.mycloudcoupon.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description SmsSkuLadder的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsSkuLadder {
    private Long id;
    private Long skuId;
    private Integer fullCount;
    private java.math.BigDecimal discount;
    private java.math.BigDecimal price;
    private boolean	 addOther;
}
