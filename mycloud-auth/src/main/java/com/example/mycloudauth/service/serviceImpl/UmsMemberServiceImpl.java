package com.example.mycloudauth.service.serviceImpl;

import java.util.List;
import com.example.mycloudauth.pojo.UmsMember;
import com.example.mycloudauth.service.UmsMemberService;
import com.example.mycloudauth.dao.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现UmsMemberService接口中的函数
* @date 2022-10-14
*/
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
    @Autowired
    UmsMemberMapper umsMemberMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public List<UmsMember> listUmsMember(){
        return umsMemberMapper.listUmsMember();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public UmsMember getUmsMemberById(Long id){
        return umsMemberMapper.getUmsMemberById(id);
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
    public List<UmsMember> listUmsMemberByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return umsMemberMapper.listUmsMemberByPage(first,second);
    }

    /**
     * @param umsMember 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int insertUmsMember(UmsMember umsMember){
        return umsMemberMapper.insertUmsMember(umsMember);
    }

    /**
     * @param umsMember 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int updateUmsMemberById(UmsMember umsMember){
        return umsMemberMapper.updateUmsMemberById(umsMember);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int deleteUmsMemberById(Long id){
        return umsMemberMapper.deleteUmsMemberById(id);
    }
}