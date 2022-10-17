package com.example.mycloudcoupon.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description SmsMemberPrice的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsMemberPrice {
    private Long id;
    private Long skuId;
    private Long memberLevelId;
    private String memberLevelName;
    private java.math.BigDecimal memberPrice;
    private boolean	 addOther;
}
