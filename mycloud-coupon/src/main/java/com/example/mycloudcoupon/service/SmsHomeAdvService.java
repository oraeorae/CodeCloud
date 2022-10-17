package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsHomeAdv;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsHomeAdv的Service提供接口
 * @date 2022-10-17
 */
public interface SmsHomeAdvService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsHomeAdv> listSmsHomeAdv();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsHomeAdv getSmsHomeAdvById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsHomeAdv> listSmsHomeAdvByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsHomeAdv(SmsHomeAdv smsHomeAdv);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsHomeAdvById(SmsHomeAdv smsHomeAdv);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsHomeAdvById(Long id);
}