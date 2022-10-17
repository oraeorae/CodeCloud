package com.example.mycloudmember.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberCollectSpu的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsMemberCollectSpu {
    private Long id;
    private Long memberId;
    private Long spuId;
    private String spuName;
    private String spuImg;
    private java.sql.Date createTime;
}
