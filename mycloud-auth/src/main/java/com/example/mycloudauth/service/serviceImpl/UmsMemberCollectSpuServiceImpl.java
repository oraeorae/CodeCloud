package com.example.mycloudauth.service.serviceImpl;

import java.util.List;
import com.example.mycloudauth.pojo.UmsMemberCollectSpu;
import com.example.mycloudauth.service.UmsMemberCollectSpuService;
import com.example.mycloudauth.dao.UmsMemberCollectSpuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Orall
* @version 1.0
* @description: 用于实现UmsMemberCollectSpuService接口中的函数
* @date 2022-10-14
*/
@Service
public class UmsMemberCollectSpuServiceImpl implements UmsMemberCollectSpuService {
    @Autowired
    UmsMemberCollectSpuMapper umsMemberCollectSpuMapper;

    /**
     * @return 以列表形式返回实体类对象
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public List<UmsMemberCollectSpu> listUmsMemberCollectSpu(){
        return umsMemberCollectSpuMapper.listUmsMemberCollectSpu();
    }

    /**
     * @param id 主键id
     * @return 实体类对象
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public UmsMemberCollectSpu getUmsMemberCollectSpuById(Long id){
        return umsMemberCollectSpuMapper.getUmsMemberCollectSpuById(id);
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
    public List<UmsMemberCollectSpu> listUmsMemberCollectSpuByPage(int page, int limit){
        int first = (page - 1) * limit;
        int second = limit;
        return umsMemberCollectSpuMapper.listUmsMemberCollectSpuByPage(first,second);
    }

    /**
     * @param umsMemberCollectSpu 要添加的实体类
     * @return 大于等于1则插入成功
     * @description 插入数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int insertUmsMemberCollectSpu(UmsMemberCollectSpu umsMemberCollectSpu){
        return umsMemberCollectSpuMapper.insertUmsMemberCollectSpu(umsMemberCollectSpu);
    }

    /**
     * @param umsMemberCollectSpu 要修改的实体类
     * @return 大于等于1则修改成功
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int updateUmsMemberCollectSpuById(UmsMemberCollectSpu umsMemberCollectSpu){
        return umsMemberCollectSpuMapper.updateUmsMemberCollectSpuById(umsMemberCollectSpu);
    }

    /**
     * @param id 主键id
     * @return 大于等于1则删除成功
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-14
     */
    @Override
    public int deleteUmsMemberCollectSpuById(Long id){
        return umsMemberCollectSpuMapper.deleteUmsMemberCollectSpuById(id);
    }
}