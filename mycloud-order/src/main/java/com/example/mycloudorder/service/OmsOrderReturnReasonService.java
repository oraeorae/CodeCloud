package com.example.mycloudorder.service;

import com.example.mycloudorder.pojo.OmsOrderReturnReason;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于OmsOrderReturnReason的Service提供接口
 * @date 2022-10-16
 */
public interface OmsOrderReturnReasonService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrderReturnReason> listOmsOrderReturnReason();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-16
     */
    OmsOrderReturnReason getOmsOrderReturnReasonById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrderReturnReason> listOmsOrderReturnReasonByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-16
     */
    int insertOmsOrderReturnReason(OmsOrderReturnReason omsOrderReturnReason);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-16
     */
    int updateOmsOrderReturnReasonById(OmsOrderReturnReason omsOrderReturnReason);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-16
     */
    int deleteOmsOrderReturnReasonById(Long id);
}