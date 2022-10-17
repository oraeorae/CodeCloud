package com.example.mycloudorder.service.serviceImpl;

import java.util.List;
import com.example.mycloudorder.pojo.OmsOrderOperateHistory;
import com.example.mycloudorder.service.OmsOrderOperateHistoryService;
import com.example.mycloudorder.dao.OmsOrderOperateHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现OmsOrderOperateHistoryService接口中的函数
* @date 2022-10-16
*/
@Service
public class OmsOrderOperateHistoryServiceImpl implements OmsOrderOperateHistoryService {
    @Autowired
    OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-16
     */
    @Override
    public List<OmsOrderOperateHistory> listOmsOrderOperateHistory(){
        return omsOrderOperateHistoryMapper.listOmsOrderOperateHistory();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-16
     */
    @Override
    public OmsOrderOperateHistory getOmsOrderOperateHistoryById(Long id){
        return omsOrderOperateHistoryMapper.getOmsOrderOperateHistoryById(id);
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
    public List<OmsOrderOperateHistory> listOmsOrderOperateHistoryByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return omsOrderOperateHistoryMapper.listOmsOrderOperateHistoryByPage(first,second);
    }

    /**
     * @param omsOrderOperateHistory 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-16
     */
    @Override
    public int insertOmsOrderOperateHistory(OmsOrderOperateHistory omsOrderOperateHistory){
        return omsOrderOperateHistoryMapper.insertOmsOrderOperateHistory(omsOrderOperateHistory);
    }

    /**
     * @param omsOrderOperateHistory 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-16
     */
    @Override
    public int updateOmsOrderOperateHistoryById(OmsOrderOperateHistory omsOrderOperateHistory){
        return omsOrderOperateHistoryMapper.updateOmsOrderOperateHistoryById(omsOrderOperateHistory);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-16
     */
    @Override
    public int deleteOmsOrderOperateHistoryById(Long id){
        return omsOrderOperateHistoryMapper.deleteOmsOrderOperateHistoryById(id);
    }
}