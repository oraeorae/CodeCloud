package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsSkuLadder;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsSkuLadder的Service提供接口
 * @date 2022-10-17
 */
public interface SmsSkuLadderService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSkuLadder> listSmsSkuLadder();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsSkuLadder getSmsSkuLadderById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSkuLadder> listSmsSkuLadderByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsSkuLadder(SmsSkuLadder smsSkuLadder);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsSkuLadderById(SmsSkuLadder smsSkuLadder);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsSkuLadderById(Long id);
}