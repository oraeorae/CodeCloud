package com.example.mycloudcoupon.service.serviceImpl;

import java.util.List;
import com.example.mycloudcoupon.pojo.SmsHomeSubjectSpu;
import com.example.mycloudcoupon.service.SmsHomeSubjectSpuService;
import com.example.mycloudcoupon.dao.SmsHomeSubjectSpuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现SmsHomeSubjectSpuService接口中的函数
* @date 2022-10-17
*/
@Service
public class SmsHomeSubjectSpuServiceImpl implements SmsHomeSubjectSpuService {
    @Autowired
    SmsHomeSubjectSpuMapper smsHomeSubjectSpuMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public List<SmsHomeSubjectSpu> listSmsHomeSubjectSpu(){
        return smsHomeSubjectSpuMapper.listSmsHomeSubjectSpu();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public SmsHomeSubjectSpu getSmsHomeSubjectSpuById(Long id){
        return smsHomeSubjectSpuMapper.getSmsHomeSubjectSpuById(id);
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
    public List<SmsHomeSubjectSpu> listSmsHomeSubjectSpuByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return smsHomeSubjectSpuMapper.listSmsHomeSubjectSpuByPage(first,second);
    }

    /**
     * @param smsHomeSubjectSpu 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int insertSmsHomeSubjectSpu(SmsHomeSubjectSpu smsHomeSubjectSpu){
        return smsHomeSubjectSpuMapper.insertSmsHomeSubjectSpu(smsHomeSubjectSpu);
    }

    /**
     * @param smsHomeSubjectSpu 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int updateSmsHomeSubjectSpuById(SmsHomeSubjectSpu smsHomeSubjectSpu){
        return smsHomeSubjectSpuMapper.updateSmsHomeSubjectSpuById(smsHomeSubjectSpu);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int deleteSmsHomeSubjectSpuById(Long id){
        return smsHomeSubjectSpuMapper.deleteSmsHomeSubjectSpuById(id);
    }
}