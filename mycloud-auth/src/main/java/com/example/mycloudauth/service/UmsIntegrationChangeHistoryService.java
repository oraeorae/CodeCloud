package com.example.mycloudauth.service;

import com.example.mycloudauth.pojo.UmsIntegrationChangeHistory;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于UmsIntegrationChangeHistory的Service提供接口
 * @date 2022-10-14
 */
public interface UmsIntegrationChangeHistoryService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-14
     */
    List<UmsIntegrationChangeHistory> listUmsIntegrationChangeHistory();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-14
     */
    UmsIntegrationChangeHistory getUmsIntegrationChangeHistoryById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-14
     */
    List<UmsIntegrationChangeHistory> listUmsIntegrationChangeHistoryByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-14
     */
    int insertUmsIntegrationChangeHistory(UmsIntegrationChangeHistory umsIntegrationChangeHistory);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-14
     */
    int updateUmsIntegrationChangeHistoryById(UmsIntegrationChangeHistory umsIntegrationChangeHistory);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-14
     */
    int deleteUmsIntegrationChangeHistoryById(Long id);
}