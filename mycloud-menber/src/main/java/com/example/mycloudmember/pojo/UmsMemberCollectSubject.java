package com.example.mycloudmember.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberCollectSubject的实体类
 * @date 2022-10-17
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UmsMemberCollectSubject {
    private Long id;
    private Long subjectId;
    private String subjectName;
    private String subjectImg;
    private String subjectUrll;
}
