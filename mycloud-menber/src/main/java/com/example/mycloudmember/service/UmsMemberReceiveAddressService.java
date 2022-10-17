package com.example.mycloudmember.service;

import com.example.mycloudmember.pojo.UmsMemberReceiveAddress;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于UmsMemberReceiveAddress的Service提供接口
 * @date 2022-10-17
 */
public interface UmsMemberReceiveAddressService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsMemberReceiveAddress> listUmsMemberReceiveAddress();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    UmsMemberReceiveAddress getUmsMemberReceiveAddressById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsMemberReceiveAddress> listUmsMemberReceiveAddressByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateUmsMemberReceiveAddressById(UmsMemberReceiveAddress umsMemberReceiveAddress);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteUmsMemberReceiveAddressById(Long id);
}