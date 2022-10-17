package com.example.mycloudcoupon.service;

import com.example.mycloudcoupon.pojo.SmsMemberPrice;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于SmsMemberPrice的Service提供接口
 * @date 2022-10-17
 */
public interface SmsMemberPriceService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsMemberPrice> listSmsMemberPrice();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    SmsMemberPrice getSmsMemberPriceById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<SmsMemberPrice> listSmsMemberPriceByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertSmsMemberPrice(SmsMemberPrice smsMemberPrice);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateSmsMemberPriceById(SmsMemberPrice smsMemberPrice);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteSmsMemberPriceById(Long id);
}