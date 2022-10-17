package com.example.mycloudcoupon.service.serviceImpl;

import java.util.List;
import com.example.mycloudcoupon.pojo.SmsCouponSpuRelation;
import com.example.mycloudcoupon.service.SmsCouponSpuRelationService;
import com.example.mycloudcoupon.dao.SmsCouponSpuRelationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现SmsCouponSpuRelationService接口中的函数
* @date 2022-10-17
*/
@Service
public class SmsCouponSpuRelationServiceImpl implements SmsCouponSpuRelationService {
    @Autowired
    SmsCouponSpuRelationMapper smsCouponSpuRelationMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public List<SmsCouponSpuRelation> listSmsCouponSpuRelation(){
        return smsCouponSpuRelationMapper.listSmsCouponSpuRelation();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public SmsCouponSpuRelation getSmsCouponSpuRelationById(Long id){
        return smsCouponSpuRelationMapper.getSmsCouponSpuRelationById(id);
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
    public List<SmsCouponSpuRelation> listSmsCouponSpuRelationByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return smsCouponSpuRelationMapper.listSmsCouponSpuRelationByPage(first,second);
    }

    /**
     * @param smsCouponSpuRelation 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int insertSmsCouponSpuRelation(SmsCouponSpuRelation smsCouponSpuRelation){
        return smsCouponSpuRelationMapper.insertSmsCouponSpuRelation(smsCouponSpuRelation);
    }

    /**
     * @param smsCouponSpuRelation 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int updateSmsCouponSpuRelationById(SmsCouponSpuRelation smsCouponSpuRelation){
        return smsCouponSpuRelationMapper.updateSmsCouponSpuRelationById(smsCouponSpuRelation);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int deleteSmsCouponSpuRelationById(Long id){
        return smsCouponSpuRelationMapper.deleteSmsCouponSpuRelationById(id);
    }
}