package com.example.mycloudmember.service;

import com.example.mycloudmember.pojo.UmsMemberCollectSpu;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于UmsMemberCollectSpu的Service提供接口
 * @date 2022-10-17
 */
public interface UmsMemberCollectSpuService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsMemberCollectSpu> listUmsMemberCollectSpu();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    UmsMemberCollectSpu getUmsMemberCollectSpuById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsMemberCollectSpu> listUmsMemberCollectSpuByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertUmsMemberCollectSpu(UmsMemberCollectSpu umsMemberCollectSpu);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateUmsMemberCollectSpuById(UmsMemberCollectSpu umsMemberCollectSpu);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteUmsMemberCollectSpuById(Long id);
}