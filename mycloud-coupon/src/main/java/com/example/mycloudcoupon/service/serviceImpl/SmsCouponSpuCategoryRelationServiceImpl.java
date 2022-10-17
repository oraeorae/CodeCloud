package com.example.mycloudcoupon.service.serviceImpl;

import java.util.List;
import com.example.mycloudcoupon.pojo.SmsCouponSpuCategoryRelation;
import com.example.mycloudcoupon.service.SmsCouponSpuCategoryRelationService;
import com.example.mycloudcoupon.dao.SmsCouponSpuCategoryRelationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现SmsCouponSpuCategoryRelationService接口中的函数
* @date 2022-10-17
*/
@Service
public class SmsCouponSpuCategoryRelationServiceImpl implements SmsCouponSpuCategoryRelationService {
    @Autowired
    SmsCouponSpuCategoryRelationMapper smsCouponSpuCategoryRelationMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public List<SmsCouponSpuCategoryRelation> listSmsCouponSpuCategoryRelation(){
        return smsCouponSpuCategoryRelationMapper.listSmsCouponSpuCategoryRelation();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public SmsCouponSpuCategoryRelation getSmsCouponSpuCategoryRelationById(Long id){
        return smsCouponSpuCategoryRelationMapper.getSmsCouponSpuCategoryRelationById(id);
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
    public List<SmsCouponSpuCategoryRelation> listSmsCouponSpuCategoryRelationByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return smsCouponSpuCategoryRelationMapper.listSmsCouponSpuCategoryRelationByPage(first,second);
    }

    /**
     * @param smsCouponSpuCategoryRelation 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int insertSmsCouponSpuCategoryRelation(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation){
        return smsCouponSpuCategoryRelationMapper.insertSmsCouponSpuCategoryRelation(smsCouponSpuCategoryRelation);
    }

    /**
     * @param smsCouponSpuCategoryRelation 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int updateSmsCouponSpuCategoryRelationById(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation){
        return smsCouponSpuCategoryRelationMapper.updateSmsCouponSpuCategoryRelationById(smsCouponSpuCategoryRelation);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int deleteSmsCouponSpuCategoryRelationById(Long id){
        return smsCouponSpuCategoryRelationMapper.deleteSmsCouponSpuCategoryRelationById(id);
    }
}