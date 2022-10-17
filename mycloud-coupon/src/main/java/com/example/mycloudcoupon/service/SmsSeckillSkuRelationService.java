package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsSeckillSkuRelation;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsSeckillSkuRelation的Service提供接口
 * @date 2022-10-17
 */
public interface SmsSeckillSkuRelationService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSeckillSkuRelation> listSmsSeckillSkuRelation();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsSeckillSkuRelation getSmsSeckillSkuRelationById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSeckillSkuRelation> listSmsSeckillSkuRelationByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsSeckillSkuRelation(SmsSeckillSkuRelation smsSeckillSkuRelation);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsSeckillSkuRelationById(SmsSeckillSkuRelation smsSeckillSkuRelation);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsSeckillSkuRelationById(Long id);
}