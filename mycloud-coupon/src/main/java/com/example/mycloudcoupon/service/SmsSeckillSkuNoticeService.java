package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsSeckillSkuNotice;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsSeckillSkuNotice的Service提供接口
 * @date 2022-10-17
 */
public interface SmsSeckillSkuNoticeService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSeckillSkuNotice> listSmsSeckillSkuNotice();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsSeckillSkuNotice getSmsSeckillSkuNoticeById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSeckillSkuNotice> listSmsSeckillSkuNoticeByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsSeckillSkuNotice(SmsSeckillSkuNotice smsSeckillSkuNotice);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsSeckillSkuNoticeById(SmsSeckillSkuNotice smsSeckillSkuNotice);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsSeckillSkuNoticeById(Long id);
}