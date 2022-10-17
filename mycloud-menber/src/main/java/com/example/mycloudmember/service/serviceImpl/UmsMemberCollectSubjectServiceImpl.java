package com.example.mycloudmember.service.serviceImpl;

import java.util.List;
import com.example.mycloudmember.pojo.UmsMemberCollectSubject;
import com.example.mycloudmember.service.UmsMemberCollectSubjectService;
import com.example.mycloudmember.dao.UmsMemberCollectSubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现UmsMemberCollectSubjectService接口中的函数
* @date 2022-10-17
*/
@Service
public class UmsMemberCollectSubjectServiceImpl implements UmsMemberCollectSubjectService {
    @Autowired
    UmsMemberCollectSubjectMapper umsMemberCollectSubjectMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public List<UmsMemberCollectSubject> listUmsMemberCollectSubject(){
        return umsMemberCollectSubjectMapper.listUmsMemberCollectSubject();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public UmsMemberCollectSubject getUmsMemberCollectSubjectById(Long id){
        return umsMemberCollectSubjectMapper.getUmsMemberCollectSubjectById(id);
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
    public List<UmsMemberCollectSubject> listUmsMemberCollectSubjectByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return umsMemberCollectSubjectMapper.listUmsMemberCollectSubjectByPage(first,second);
    }

    /**
     * @param umsMemberCollectSubject 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int insertUmsMemberCollectSubject(UmsMemberCollectSubject umsMemberCollectSubject){
        return umsMemberCollectSubjectMapper.insertUmsMemberCollectSubject(umsMemberCollectSubject);
    }

    /**
     * @param umsMemberCollectSubject 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int updateUmsMemberCollectSubjectById(UmsMemberCollectSubject umsMemberCollectSubject){
        return umsMemberCollectSubjectMapper.updateUmsMemberCollectSubjectById(umsMemberCollectSubject);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    @Override
    public int deleteUmsMemberCollectSubjectById(Long id){
        return umsMemberCollectSubjectMapper.deleteUmsMemberCollectSubjectById(id);
    }
}