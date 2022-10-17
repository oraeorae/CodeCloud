package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsSkuFullReduction;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsSkuFullReduction的Service提供接口
 * @date 2022-10-17
 */
public interface SmsSkuFullReductionService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSkuFullReduction> listSmsSkuFullReduction();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsSkuFullReduction getSmsSkuFullReductionById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSkuFullReduction> listSmsSkuFullReductionByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsSkuFullReduction(SmsSkuFullReduction smsSkuFullReduction);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsSkuFullReductionById(SmsSkuFullReduction smsSkuFullReduction);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsSkuFullReductionById(Long id);
}