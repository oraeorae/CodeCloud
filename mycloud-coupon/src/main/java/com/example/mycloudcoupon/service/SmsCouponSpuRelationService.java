package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsCouponSpuRelation;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsCouponSpuRelation的Service提供接口
 * @date 2022-10-17
 */
public interface SmsCouponSpuRelationService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsCouponSpuRelation> listSmsCouponSpuRelation();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsCouponSpuRelation getSmsCouponSpuRelationById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsCouponSpuRelation> listSmsCouponSpuRelationByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsCouponSpuRelation(SmsCouponSpuRelation smsCouponSpuRelation);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsCouponSpuRelationById(SmsCouponSpuRelation smsCouponSpuRelation);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsCouponSpuRelationById(Long id);
}