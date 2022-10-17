package com.example.mycloudcoupon.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description SmsSeckillSession的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsSeckillSession {
    private Long id;
    private String name;
    private java.sql.Date startTime;
    private java.sql.Date endTime;
    private boolean	 status;
    private java.sql.Date createTime;
}
