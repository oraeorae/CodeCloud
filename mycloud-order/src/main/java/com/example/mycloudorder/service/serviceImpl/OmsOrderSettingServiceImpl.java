package com.example.mycloudorder.service.serviceImpl;

import java.util.List;
import com.example.mycloudorder.pojo.OmsOrderSetting;
import com.example.mycloudorder.service.OmsOrderSettingService;
import com.example.mycloudorder.dao.OmsOrderSettingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现OmsOrderSettingService接口中的函数
* @date 2022-10-16
*/
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {
    @Autowired
    OmsOrderSettingMapper omsOrderSettingMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-16
     */
    @Override
    public List<OmsOrderSetting> listOmsOrderSetting(){
        return omsOrderSettingMapper.listOmsOrderSetting();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-16
     */
    @Override
    public OmsOrderSetting getOmsOrderSettingById(Long id){
        return omsOrderSettingMapper.getOmsOrderSettingById(id);
    }

    /**
     * @param page 页数
     * @param limit 每页限制数据量
     * @return 以列表形式返回实体类对象
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-16
     */
    @Override
    public List<OmsOrderSetting> listOmsOrderSettingByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return omsOrderSettingMapper.listOmsOrderSettingByPage(first,second);
    }

    /**
     * @param omsOrderSetting 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-16
     */
    @Override
    public int insertOmsOrderSetting(OmsOrderSetting omsOrderSetting){
        return omsOrderSettingMapper.insertOmsOrderSetting(omsOrderSetting);
    }

    /**
     * @param omsOrderSetting 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-16
     */
    @Override
    public int updateOmsOrderSettingById(OmsOrderSetting omsOrderSetting){
        return omsOrderSettingMapper.updateOmsOrderSettingById(omsOrderSetting);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-16
     */
    @Override
    public int deleteOmsOrderSettingById(Long id){
        return omsOrderSettingMapper.deleteOmsOrderSettingById(id);
    }
}