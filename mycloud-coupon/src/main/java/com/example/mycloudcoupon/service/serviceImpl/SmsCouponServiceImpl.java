package com.example.mycloudcoupon.service.serviceImpl;

import java.util.List;
import com.example.mycloudcoupon.pojo.SmsCoupon;
import com.example.mycloudcoupon.service.SmsCouponService;
import com.example.mycloudcoupon.dao.SmsCouponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现SmsCouponService接口中的函数
* @date 2022-10-17
*/
@Service
public class SmsCouponServiceImpl implements SmsCouponService {
    @Autowired
    SmsCouponMapper smsCouponMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public List<SmsCoupon> listSmsCoupon(){
        return smsCouponMapper.listSmsCoupon();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public SmsCoupon getSmsCouponById(Long id){
        return smsCouponMapper.getSmsCouponById(id);
    }

    /**
     * @param page 页数
     * @param limit 每页限制数据量
     * @return 以列表形式返回实体类对象
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public List<SmsCoupon> listSmsCouponByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return smsCouponMapper.listSmsCouponByPage(first,second);
    }

    /**
     * @param smsCoupon 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int insertSmsCoupon(SmsCoupon smsCoupon){
        return smsCouponMapper.insertSmsCoupon(smsCoupon);
    }

    /**
     * @param smsCoupon 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int updateSmsCouponById(SmsCoupon smsCoupon){
        return smsCouponMapper.updateSmsCouponById(smsCoupon);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int deleteSmsCouponById(Long id){
        return smsCouponMapper.deleteSmsCouponById(id);
    }
}