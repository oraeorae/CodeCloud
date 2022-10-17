package com.example.mycloudauth.service.serviceImpl;

import java.util.List;
import com.example.mycloudauth.pojo.UmsGrowthChangeHistory;
import com.example.mycloudauth.service.UmsGrowthChangeHistoryService;
import com.example.mycloudauth.dao.UmsGrowthChangeHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现UmsGrowthChangeHistoryService接口中的函数
* @date 2022-10-14
*/
@Service
public class UmsGrowthChangeHistoryServiceImpl implements UmsGrowthChangeHistoryService {
    @Autowired
    UmsGrowthChangeHistoryMapper umsGrowthChangeHistoryMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public List<UmsGrowthChangeHistory> listUmsGrowthChangeHistory(){
        return umsGrowthChangeHistoryMapper.listUmsGrowthChangeHistory();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public UmsGrowthChangeHistory getUmsGrowthChangeHistoryById(Long id){
        return umsGrowthChangeHistoryMapper.getUmsGrowthChangeHistoryById(id);
    }

    /**
     * @param page 页数
     * @param limit 每页限制数据量
     * @return 以列表形式返回实体类对象
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public List<UmsGrowthChangeHistory> listUmsGrowthChangeHistoryByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return umsGrowthChangeHistoryMapper.listUmsGrowthChangeHistoryByPage(first,second);
    }

    /**
     * @param umsGrowthChangeHistory 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int insertUmsGrowthChangeHistory(UmsGrowthChangeHistory umsGrowthChangeHistory){
        return umsGrowthChangeHistoryMapper.insertUmsGrowthChangeHistory(umsGrowthChangeHistory);
    }

    /**
     * @param umsGrowthChangeHistory 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int updateUmsGrowthChangeHistoryById(UmsGrowthChangeHistory umsGrowthChangeHistory){
        return umsGrowthChangeHistoryMapper.updateUmsGrowthChangeHistoryById(umsGrowthChangeHistory);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int deleteUmsGrowthChangeHistoryById(Long id){
        return umsGrowthChangeHistoryMapper.deleteUmsGrowthChangeHistoryById(id);
    }
}