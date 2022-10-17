package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsHomeSubjectSpu;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsHomeSubjectSpu的Service提供接口
 * @date 2022-10-17
 */
public interface SmsHomeSubjectSpuService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsHomeSubjectSpu> listSmsHomeSubjectSpu();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsHomeSubjectSpu getSmsHomeSubjectSpuById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsHomeSubjectSpu> listSmsHomeSubjectSpuByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsHomeSubjectSpu(SmsHomeSubjectSpu smsHomeSubjectSpu);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsHomeSubjectSpuById(SmsHomeSubjectSpu smsHomeSubjectSpu);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsHomeSubjectSpuById(Long id);
}