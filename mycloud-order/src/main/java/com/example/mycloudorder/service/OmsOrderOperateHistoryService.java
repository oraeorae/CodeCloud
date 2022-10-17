package com.example.mycloudorder.service;

import com.example.mycloudorder.pojo.OmsOrderOperateHistory;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于OmsOrderOperateHistory的Service提供接口
 * @date 2022-10-16
 */
public interface OmsOrderOperateHistoryService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrderOperateHistory> listOmsOrderOperateHistory();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-16
     */
    OmsOrderOperateHistory getOmsOrderOperateHistoryById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrderOperateHistory> listOmsOrderOperateHistoryByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-16
     */
    int insertOmsOrderOperateHistory(OmsOrderOperateHistory omsOrderOperateHistory);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-16
     */
    int updateOmsOrderOperateHistoryById(OmsOrderOperateHistory omsOrderOperateHistory);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-16
     */
    int deleteOmsOrderOperateHistoryById(Long id);
}