package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsSeckillPromotion;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsSeckillPromotion的Service提供接口
 * @date 2022-10-17
 */
public interface SmsSeckillPromotionService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSeckillPromotion> listSmsSeckillPromotion();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsSeckillPromotion getSmsSeckillPromotionById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSeckillPromotion> listSmsSeckillPromotionByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsSeckillPromotion(SmsSeckillPromotion smsSeckillPromotion);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsSeckillPromotionById(SmsSeckillPromotion smsSeckillPromotion);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsSeckillPromotionById(Long id);
}