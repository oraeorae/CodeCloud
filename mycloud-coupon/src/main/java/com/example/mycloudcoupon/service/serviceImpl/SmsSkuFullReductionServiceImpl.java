package com.example.mycloudcoupon.service.serviceImpl;

import java.util.List;
import com.example.mycloudcoupon.pojo.SmsSkuFullReduction;
import com.example.mycloudcoupon.service.SmsSkuFullReductionService;
import com.example.mycloudcoupon.dao.SmsSkuFullReductionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现SmsSkuFullReductionService接口中的函数
* @date 2022-10-17
*/
@Service
public class SmsSkuFullReductionServiceImpl implements SmsSkuFullReductionService {
    @Autowired
    SmsSkuFullReductionMapper smsSkuFullReductionMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public List<SmsSkuFullReduction> listSmsSkuFullReduction(){
        return smsSkuFullReductionMapper.listSmsSkuFullReduction();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public SmsSkuFullReduction getSmsSkuFullReductionById(Long id){
        return smsSkuFullReductionMapper.getSmsSkuFullReductionById(id);
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
    public List<SmsSkuFullReduction> listSmsSkuFullReductionByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return smsSkuFullReductionMapper.listSmsSkuFullReductionByPage(first,second);
    }

    /**
     * @param smsSkuFullReduction 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int insertSmsSkuFullReduction(SmsSkuFullReduction smsSkuFullReduction){
        return smsSkuFullReductionMapper.insertSmsSkuFullReduction(smsSkuFullReduction);
    }

    /**
     * @param smsSkuFullReduction 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int updateSmsSkuFullReductionById(SmsSkuFullReduction smsSkuFullReduction){
        return smsSkuFullReductionMapper.updateSmsSkuFullReductionById(smsSkuFullReduction);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int deleteSmsSkuFullReductionById(Long id){
        return smsSkuFullReductionMapper.deleteSmsSkuFullReductionById(id);
    }
}