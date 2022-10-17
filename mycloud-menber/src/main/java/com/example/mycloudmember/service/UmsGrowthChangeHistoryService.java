package com.example.mycloudmember.service;

import com.example.mycloudmember.pojo.UmsGrowthChangeHistory;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于UmsGrowthChangeHistory的Service提供接口
 * @date 2022-10-17
 */
public interface UmsGrowthChangeHistoryService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsGrowthChangeHistory> listUmsGrowthChangeHistory();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    UmsGrowthChangeHistory getUmsGrowthChangeHistoryById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsGrowthChangeHistory> listUmsGrowthChangeHistoryByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertUmsGrowthChangeHistory(UmsGrowthChangeHistory umsGrowthChangeHistory);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateUmsGrowthChangeHistoryById(UmsGrowthChangeHistory umsGrowthChangeHistory);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteUmsGrowthChangeHistoryById(Long id);
}