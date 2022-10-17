package com.example.mycloudauth.service;

import com.example.mycloudauth.pojo.UmsMemberCollectSubject;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于UmsMemberCollectSubject的Service提供接口
 * @date 2022-10-14
 */
public interface UmsMemberCollectSubjectService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-14
     */
    List<UmsMemberCollectSubject> listUmsMemberCollectSubject();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-14
     */
    UmsMemberCollectSubject getUmsMemberCollectSubjectById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-14
     */
    List<UmsMemberCollectSubject> listUmsMemberCollectSubjectByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-14
     */
    int insertUmsMemberCollectSubject(UmsMemberCollectSubject umsMemberCollectSubject);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-14
     */
    int updateUmsMemberCollectSubjectById(UmsMemberCollectSubject umsMemberCollectSubject);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-14
     */
    int deleteUmsMemberCollectSubjectById(Long id);
}