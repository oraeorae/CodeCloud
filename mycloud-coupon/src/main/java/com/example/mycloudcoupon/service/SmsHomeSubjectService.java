package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsHomeSubject;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsHomeSubject的Service提供接口
 * @date 2022-10-17
 */
public interface SmsHomeSubjectService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsHomeSubject> listSmsHomeSubject();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsHomeSubject getSmsHomeSubjectById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsHomeSubject> listSmsHomeSubjectByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsHomeSubject(SmsHomeSubject smsHomeSubject);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsHomeSubjectById(SmsHomeSubject smsHomeSubject);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsHomeSubjectById(Long id);
}