package com.example.mycloudcoupon.service.serviceImpl;

import java.util.List;
import com.example.mycloudcoupon.pojo.SmsSkuLadder;
import com.example.mycloudcoupon.service.SmsSkuLadderService;
import com.example.mycloudcoupon.dao.SmsSkuLadderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现SmsSkuLadderService接口中的函数
* @date 2022-10-17
*/
@Service
public class SmsSkuLadderServiceImpl implements SmsSkuLadderService {
    @Autowired
    SmsSkuLadderMapper smsSkuLadderMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public List<SmsSkuLadder> listSmsSkuLadder(){
        return smsSkuLadderMapper.listSmsSkuLadder();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public SmsSkuLadder getSmsSkuLadderById(Long id){
        return smsSkuLadderMapper.getSmsSkuLadderById(id);
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
    public List<SmsSkuLadder> listSmsSkuLadderByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return smsSkuLadderMapper.listSmsSkuLadderByPage(first,second);
    }

    /**
     * @param smsSkuLadder 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int insertSmsSkuLadder(SmsSkuLadder smsSkuLadder){
        return smsSkuLadderMapper.insertSmsSkuLadder(smsSkuLadder);
    }

    /**
     * @param smsSkuLadder 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int updateSmsSkuLadderById(SmsSkuLadder smsSkuLadder){
        return smsSkuLadderMapper.updateSmsSkuLadderById(smsSkuLadder);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int deleteSmsSkuLadderById(Long id){
        return smsSkuLadderMapper.deleteSmsSkuLadderById(id);
    }
}