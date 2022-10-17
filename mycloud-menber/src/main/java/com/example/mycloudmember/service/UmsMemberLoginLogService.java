package com.example.mycloudmember.service;

import com.example.mycloudmember.pojo.UmsMemberLoginLog;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于UmsMemberLoginLog的Service提供接口
 * @date 2022-10-17
 */
public interface UmsMemberLoginLogService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsMemberLoginLog> listUmsMemberLoginLog();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    UmsMemberLoginLog getUmsMemberLoginLogById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsMemberLoginLog> listUmsMemberLoginLogByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertUmsMemberLoginLog(UmsMemberLoginLog umsMemberLoginLog);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateUmsMemberLoginLogById(UmsMemberLoginLog umsMemberLoginLog);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteUmsMemberLoginLogById(Long id);
}