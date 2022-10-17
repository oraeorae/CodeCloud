package com.example.mycloudmember.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberLoginLog的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsMemberLoginLog {
    private Long id;
    private Long memberId;
    private java.sql.Date createTime;
    private String ip;
    private String city;
    private boolean	 loginType;
}
