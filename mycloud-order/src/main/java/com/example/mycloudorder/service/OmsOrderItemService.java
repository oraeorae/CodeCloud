package com.example.mycloudorder.service;

import com.example.mycloudorder.pojo.OmsOrderItem;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于OmsOrderItem的Service提供接口
 * @date 2022-10-16
 */
public interface OmsOrderItemService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrderItem> listOmsOrderItem();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-16
     */
    OmsOrderItem getOmsOrderItemById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrderItem> listOmsOrderItemByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-16
     */
    int insertOmsOrderItem(OmsOrderItem omsOrderItem);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-16
     */
    int updateOmsOrderItemById(OmsOrderItem omsOrderItem);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-16
     */
    int deleteOmsOrderItemById(Long id);
}