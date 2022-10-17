package com.example.mycloudcoupon.service.serviceImpl;

import java.util.List;
import com.example.mycloudcoupon.pojo.SmsCouponHistory;
import com.example.mycloudcoupon.service.SmsCouponHistoryService;
import com.example.mycloudcoupon.dao.SmsCouponHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现SmsCouponHistoryService接口中的函数
* @date 2022-10-17
*/
@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {
    @Autowired
    SmsCouponHistoryMapper smsCouponHistoryMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public List<SmsCouponHistory> listSmsCouponHistory(){
        return smsCouponHistoryMapper.listSmsCouponHistory();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public SmsCouponHistory getSmsCouponHistoryById(Long id){
        return smsCouponHistoryMapper.getSmsCouponHistoryById(id);
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
    public List<SmsCouponHistory> listSmsCouponHistoryByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return smsCouponHistoryMapper.listSmsCouponHistoryByPage(first,second);
    }

    /**
     * @param smsCouponHistory 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int insertSmsCouponHistory(SmsCouponHistory smsCouponHistory){
        return smsCouponHistoryMapper.insertSmsCouponHistory(smsCouponHistory);
    }

    /**
     * @param smsCouponHistory 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int updateSmsCouponHistoryById(SmsCouponHistory smsCouponHistory){
        return smsCouponHistoryMapper.updateSmsCouponHistoryById(smsCouponHistory);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int deleteSmsCouponHistoryById(Long id){
        return smsCouponHistoryMapper.deleteSmsCouponHistoryById(id);
    }
}