package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsCoupon;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsCoupon的Service提供接口
 * @date 2022-10-17
 */
public interface SmsCouponService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsCoupon> listSmsCoupon();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsCoupon getSmsCouponById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsCoupon> listSmsCouponByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsCoupon(SmsCoupon smsCoupon);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsCouponById(SmsCoupon smsCoupon);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsCouponById(Long id);
}