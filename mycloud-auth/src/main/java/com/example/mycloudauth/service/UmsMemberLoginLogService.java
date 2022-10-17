package com.example.mycloudauth.service;

import com.example.mycloudauth.pojo.UmsMemberLoginLog;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于UmsMemberLoginLog的Service提供接口
 * @date 2022-10-14
 */
public interface UmsMemberLoginLogService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-14
     */
    List<UmsMemberLoginLog> listUmsMemberLoginLog();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-14
     */
    UmsMemberLoginLog getUmsMemberLoginLogById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-14
     */
    List<UmsMemberLoginLog> listUmsMemberLoginLogByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-14
     */
    int insertUmsMemberLoginLog(UmsMemberLoginLog umsMemberLoginLog);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-14
     */
    int updateUmsMemberLoginLogById(UmsMemberLoginLog umsMemberLoginLog);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-14
     */
    int deleteUmsMemberLoginLogById(Long id);
}