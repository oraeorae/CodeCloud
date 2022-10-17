package com.example.mycloudorder.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description OmsOrderOperateHistory的实体类
 * @date 2022-10-16
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OmsOrderOperateHistory {
    private Long id;
    private Long order_id;
    private String operate_man;
    private java.sql.Date create_time;
    private Integer order_status;
    private String note;
}
