package com.example.mycloudorder.service;

import com.example.mycloudorder.pojo.OmsOrderReturnApply;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于OmsOrderReturnApply的Service提供接口
 * @date 2022-10-16
 */
public interface OmsOrderReturnApplyService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrderReturnApply> listOmsOrderReturnApply();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-16
     */
    OmsOrderReturnApply getOmsOrderReturnApplyById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-16
     */
    List<OmsOrderReturnApply> listOmsOrderReturnApplyByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-16
     */
    int insertOmsOrderReturnApply(OmsOrderReturnApply omsOrderReturnApply);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-16
     */
    int updateOmsOrderReturnApplyById(OmsOrderReturnApply omsOrderReturnApply);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-16
     */
    int deleteOmsOrderReturnApplyById(Long id);
}