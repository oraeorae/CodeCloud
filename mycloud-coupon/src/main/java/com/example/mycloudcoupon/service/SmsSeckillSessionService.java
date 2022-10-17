package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsSeckillSession;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsSeckillSession的Service提供接口
 * @date 2022-10-17
 */
public interface SmsSeckillSessionService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSeckillSession> listSmsSeckillSession();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsSeckillSession getSmsSeckillSessionById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsSeckillSession> listSmsSeckillSessionByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsSeckillSession(SmsSeckillSession smsSeckillSession);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsSeckillSessionById(SmsSeckillSession smsSeckillSession);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsSeckillSessionById(Long id);
}