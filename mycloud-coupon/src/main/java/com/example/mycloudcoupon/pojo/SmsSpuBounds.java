package com.example.mycloudcoupon.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description SmsSpuBounds的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsSpuBounds {
    private Long id;
    private Long spuId;
    private java.math.BigDecimal growBounds;
    private java.math.BigDecimal buyBounds;
    private boolean	 work;
}
