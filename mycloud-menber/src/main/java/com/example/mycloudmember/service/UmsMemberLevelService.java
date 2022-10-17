package com.example.mycloudmember.service;

import com.example.mycloudmember.pojo.UmsMemberLevel;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于UmsMemberLevel的Service提供接口
 * @date 2022-10-17
 */
public interface UmsMemberLevelService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsMemberLevel> listUmsMemberLevel();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    UmsMemberLevel getUmsMemberLevelById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsMemberLevel> listUmsMemberLevelByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertUmsMemberLevel(UmsMemberLevel umsMemberLevel);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateUmsMemberLevelById(UmsMemberLevel umsMemberLevel);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteUmsMemberLevelById(Long id);
}