package com.example.mycloudauth.pojo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMember的实体类
 * @date 2022-10-14
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsMember {
    private Long id;
    private Long level_id;
    private String username;
    private String password;
    private String nickname;
    private String mobile;
    private String email;
    private String header;
    private Integer gender;
    private java.sql.Date	 birth;
    private String city;
    private String job;
    private String sign;
    private Integer source_type;
    private Integer integration;
    private Integer growth;
    private Integer status;
    private java.sql.Date create_time;
}
