package com.example.mycloudauth.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberStatisticsInfo的实体类
 * @date 2022-10-14
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsMemberStatisticsInfo {
    private Long id;
    private Long member_id;
    private java.math.BigDecimal consume_amount;
    private java.math.BigDecimal coupon_amount;
    private Integer order_count;
    private Integer coupon_count;
    private Integer comment_count;
    private Integer return_order_count;
    private Integer login_count;
    private Integer attend_count;
    private Integer fans_count;
    private Integer collect_product_count;
    private Integer collect_subject_count;
    private Integer collect_comment_count;
    private Integer invite_friend_count;
}
