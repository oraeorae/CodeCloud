package com.example.mycloudorder.service;

import com.example.mycloudorder.pojo.OmsOrderSetting;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于OmsOrderSetting的Service提供接口
 * @date 2022-10-16
 */
public interface OmsOrderSettingService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrderSetting> listOmsOrderSetting();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-16
     */
    OmsOrderSetting getOmsOrderSettingById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrderSetting> listOmsOrderSettingByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-16
     */
    int insertOmsOrderSetting(OmsOrderSetting omsOrderSetting);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-16
     */
    int updateOmsOrderSettingById(OmsOrderSetting omsOrderSetting);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-16
     */
    int deleteOmsOrderSettingById(Long id);
}