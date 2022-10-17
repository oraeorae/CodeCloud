package com.example.mycloudcoupon.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description SmsCoupon的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsCoupon {
    private Long id;
    private boolean	 couponType;
    private String couponImg;
    private String couponName;
    private Integer num;
    private java.math.BigDecimal amount;
    private Integer perLimit;
    private java.math.BigDecimal minPoint;
    private java.sql.Date startTime;
    private java.sql.Date endTime;
    private boolean	 useType;
    private String note;
    private Integer publishCount;
    private Integer useCount;
    private Integer receiveCount;
    private java.sql.Date enableStartTime;
    private java.sql.Date enableEndTime;
    private String code;
    private boolean	 memberLevel;
    private boolean	 publish;
}
