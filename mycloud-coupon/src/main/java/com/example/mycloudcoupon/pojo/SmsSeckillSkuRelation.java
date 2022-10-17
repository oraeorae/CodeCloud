package com.example.mycloudcoupon.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description SmsSeckillSkuRelation的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsSeckillSkuRelation {
    private Long id;
    private Long promotionId;
    private Long promotionSessionId;
    private Long skuId;
    private java.math.BigDecimal seckillPrice;
    private java.math.BigDecimal seckillCount;
    private java.math.BigDecimal seckillLimit;
    private Integer seckillSort;
}
