package com.example.mycloudmember.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsGrowthChangeHistory的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsGrowthChangeHistory {
    private Long id;
    private Long memberId;
    private java.sql.Date createTime;
    private Integer changeCount;
    private String note;
    private Integer sourceType;
}
