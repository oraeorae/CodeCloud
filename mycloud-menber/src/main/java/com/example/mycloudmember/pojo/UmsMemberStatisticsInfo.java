package com.example.mycloudmember.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberStatisticsInfo的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsMemberStatisticsInfo {
    private Long id;
    private Long memberId;
    private java.math.BigDecimal consumeAmount;
    private java.math.BigDecimal couponAmount;
    private Integer orderCount;
    private Integer couponCount;
    private Integer commentCount;
    private Integer returnOrderCount;
    private Integer loginCount;
    private Integer attendCount;
    private Integer fansCount;
    private Integer collectProductCount;
    private Integer collectSubjectCount;
    private Integer collectCommentCount;
    private Integer inviteFriendCount;
}
