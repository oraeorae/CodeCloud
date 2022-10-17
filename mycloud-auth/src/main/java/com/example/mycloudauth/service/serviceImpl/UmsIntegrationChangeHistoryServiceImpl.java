package com.example.mycloudauth.service.serviceImpl;

import java.util.List;
import com.example.mycloudauth.pojo.UmsIntegrationChangeHistory;
import com.example.mycloudauth.service.UmsIntegrationChangeHistoryService;
import com.example.mycloudauth.dao.UmsIntegrationChangeHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现UmsIntegrationChangeHistoryService接口中的函数
* @date 2022-10-14
*/
@Service
public class UmsIntegrationChangeHistoryServiceImpl implements UmsIntegrationChangeHistoryService {
    @Autowired
    UmsIntegrationChangeHistoryMapper umsIntegrationChangeHistoryMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public List<UmsIntegrationChangeHistory> listUmsIntegrationChangeHistory(){
        return umsIntegrationChangeHistoryMapper.listUmsIntegrationChangeHistory();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public UmsIntegrationChangeHistory getUmsIntegrationChangeHistoryById(Long id){
        return umsIntegrationChangeHistoryMapper.getUmsIntegrationChangeHistoryById(id);
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
    public List<UmsIntegrationChangeHistory> listUmsIntegrationChangeHistoryByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return umsIntegrationChangeHistoryMapper.listUmsIntegrationChangeHistoryByPage(first,second);
    }

    /**
     * @param umsIntegrationChangeHistory 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int insertUmsIntegrationChangeHistory(UmsIntegrationChangeHistory umsIntegrationChangeHistory){
        return umsIntegrationChangeHistoryMapper.insertUmsIntegrationChangeHistory(umsIntegrationChangeHistory);
    }

    /**
     * @param umsIntegrationChangeHistory 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int updateUmsIntegrationChangeHistoryById(UmsIntegrationChangeHistory umsIntegrationChangeHistory){
        return umsIntegrationChangeHistoryMapper.updateUmsIntegrationChangeHistoryById(umsIntegrationChangeHistory);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int deleteUmsIntegrationChangeHistoryById(Long id){
        return umsIntegrationChangeHistoryMapper.deleteUmsIntegrationChangeHistoryById(id);
    }
}