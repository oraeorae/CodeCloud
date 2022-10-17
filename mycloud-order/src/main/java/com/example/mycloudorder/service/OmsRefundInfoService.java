package com.example.mycloudorder.service;

import com.example.mycloudorder.pojo.OmsRefundInfo;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于OmsRefundInfo的Service提供接口
 * @date 2022-10-16
 */
public interface OmsRefundInfoService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsRefundInfo> listOmsRefundInfo();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-16
     */
    OmsRefundInfo getOmsRefundInfoById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsRefundInfo> listOmsRefundInfoByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-16
     */
    int insertOmsRefundInfo(OmsRefundInfo omsRefundInfo);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-16
     */
    int updateOmsRefundInfoById(OmsRefundInfo omsRefundInfo);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-16
     */
    int deleteOmsRefundInfoById(Long id);
}