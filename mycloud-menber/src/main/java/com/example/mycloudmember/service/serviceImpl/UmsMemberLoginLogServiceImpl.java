package com.example.mycloudmember.service.serviceImpl;

import java.util.List;
import com.example.mycloudmember.pojo.UmsMemberLoginLog;
import com.example.mycloudmember.service.UmsMemberLoginLogService;
import com.example.mycloudmember.dao.UmsMemberLoginLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现UmsMemberLoginLogService接口中的函数
* @date 2022-10-17
*/
@Service
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService {
    @Autowired
    UmsMemberLoginLogMapper umsMemberLoginLogMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public List<UmsMemberLoginLog> listUmsMemberLoginLog(){
        return umsMemberLoginLogMapper.listUmsMemberLoginLog();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public UmsMemberLoginLog getUmsMemberLoginLogById(Long id){
        return umsMemberLoginLogMapper.getUmsMemberLoginLogById(id);
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
    public List<UmsMemberLoginLog> listUmsMemberLoginLogByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return umsMemberLoginLogMapper.listUmsMemberLoginLogByPage(first,second);
    }

    /**
     * @param umsMemberLoginLog 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int insertUmsMemberLoginLog(UmsMemberLoginLog umsMemberLoginLog){
        return umsMemberLoginLogMapper.insertUmsMemberLoginLog(umsMemberLoginLog);
    }

    /**
     * @param umsMemberLoginLog 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int updateUmsMemberLoginLogById(UmsMemberLoginLog umsMemberLoginLog){
        return umsMemberLoginLogMapper.updateUmsMemberLoginLogById(umsMemberLoginLog);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int deleteUmsMemberLoginLogById(Long id){
        return umsMemberLoginLogMapper.deleteUmsMemberLoginLogById(id);
    }
}