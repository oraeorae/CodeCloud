package com.example.mycloudmember.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberLevel的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsMemberLevel {
    private Long id;
    private String name;
    private Integer growthPoint;
    private Integer defaultStatus;
    private java.math.BigDecimal freeFreightPoint;
    private Integer commentGrowthPoint;
    private Integer priviledgeFreeFreight;
    private Integer priviledgeMemberPrice;
    private Integer priviledgeBirthday;
    private String note;
}
