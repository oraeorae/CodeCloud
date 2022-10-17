package com.example.mycloudmember.service;

import com.example.mycloudmember.pojo.UmsIntegrationChangeHistory;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于UmsIntegrationChangeHistory的Service提供接口
 * @date 2022-10-17
 */
public interface UmsIntegrationChangeHistoryService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsIntegrationChangeHistory> listUmsIntegrationChangeHistory();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    UmsIntegrationChangeHistory getUmsIntegrationChangeHistoryById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsIntegrationChangeHistory> listUmsIntegrationChangeHistoryByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertUmsIntegrationChangeHistory(UmsIntegrationChangeHistory umsIntegrationChangeHistory);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateUmsIntegrationChangeHistoryById(UmsIntegrationChangeHistory umsIntegrationChangeHistory);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteUmsIntegrationChangeHistoryById(Long id);
}