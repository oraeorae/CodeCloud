package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsSpuBounds;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsSpuBounds的Service提供接口
 * @date 2022-10-17
 */
public interface SmsSpuBoundsService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSpuBounds> listSmsSpuBounds();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsSpuBounds getSmsSpuBoundsById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSpuBounds> listSmsSpuBoundsByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsSpuBounds(SmsSpuBounds smsSpuBounds);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsSpuBoundsById(SmsSpuBounds smsSpuBounds);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsSpuBoundsById(Long id);
}