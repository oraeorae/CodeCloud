package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsCouponHistory;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsCouponHistory的Service提供接口
 * @date 2022-10-17
 */
public interface SmsCouponHistoryService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsCouponHistory> listSmsCouponHistory();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsCouponHistory getSmsCouponHistoryById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsCouponHistory> listSmsCouponHistoryByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsCouponHistory(SmsCouponHistory smsCouponHistory);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsCouponHistoryById(SmsCouponHistory smsCouponHistory);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsCouponHistoryById(Long id);
}