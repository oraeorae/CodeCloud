package com.example.mycloudauth.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsGrowthChangeHistory的实体类
 * @date 2022-10-14
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsGrowthChangeHistory {
    private Long id;
    private Long member_id;
    private java.sql.Date create_time;
    private Integer change_count;
    private String note;
    private Integer source_type;
}
