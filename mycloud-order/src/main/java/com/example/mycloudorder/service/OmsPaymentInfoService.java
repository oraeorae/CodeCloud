package com.example.mycloudorder.service;

import com.example.mycloudorder.pojo.OmsPaymentInfo;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于OmsPaymentInfo的Service提供接口
 * @date 2022-10-16
 */
public interface OmsPaymentInfoService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsPaymentInfo> listOmsPaymentInfo();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-16
     */
    OmsPaymentInfo getOmsPaymentInfoById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsPaymentInfo> listOmsPaymentInfoByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-16
     */
    int insertOmsPaymentInfo(OmsPaymentInfo omsPaymentInfo);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-16
     */
    int updateOmsPaymentInfoById(OmsPaymentInfo omsPaymentInfo);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-16
     */
    int deleteOmsPaymentInfoById(Long id);
}