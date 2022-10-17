package com.example.mycloudauth.service;

import com.example.mycloudauth.pojo.UmsMember;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于UmsMember的Service提供接口
 * @date 2022-10-14
 */
public interface UmsMemberService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-14
     */
    List<UmsMember> listUmsMember();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-14
     */
    UmsMember getUmsMemberById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-14
     */
    List<UmsMember> listUmsMemberByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-14
     */
    int insertUmsMember(UmsMember umsMember);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-14
     */
    int updateUmsMemberById(UmsMember umsMember);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-14
     */
    int deleteUmsMemberById(Long id);
}