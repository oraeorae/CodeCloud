package com.example.mycloudauth.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberLevel的实体类
 * @date 2022-10-14
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsMemberLevel {
    private Long id;
    private String name;
    private Integer growth_point;
    private Integer default_status;
    private java.math.BigDecimal free_freight_point;
    private Integer comment_growth_point;
    private Integer priviledge_free_freight;
    private Integer priviledge_member_price;
    private Integer priviledge_birthday;
    private String note;
}
