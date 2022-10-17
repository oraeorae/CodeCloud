package com.example.mycloudorder.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description OmsOrderSetting的实体类
 * @date 2022-10-16
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OmsOrderSetting {
    private Long id;
    private Integer flash_order_overtime;
    private Integer normal_order_overtime;
    private Integer confirm_overtime;
    private Integer finish_overtime;
    private Integer comment_overtime;
    private Integer member_level;
}
