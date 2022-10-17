package com.example.mycloudorder.service;

import com.example.mycloudorder.pojo.OmsOrder;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于OmsOrder的Service提供接口
 * @date 2022-10-16
 */
public interface OmsOrderService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrder> listOmsOrder();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-16
     */
    OmsOrder getOmsOrderById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrder> listOmsOrderByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-16
     */
    int insertOmsOrder(OmsOrder omsOrder);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-16
     */
    int updateOmsOrderById(OmsOrder omsOrder);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-16
     */
    int deleteOmsOrderById(Long id);
}