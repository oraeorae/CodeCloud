package com.example.mycloudmember.service;

import com.example.mycloudmember.pojo.UmsMemberStatisticsInfo;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description: 用于UmsMemberStatisticsInfo的Service提供接口
 * @date 2022-10-17
 */
public interface UmsMemberStatisticsInfoService {

    /**
     * @description 查询所有数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsMemberStatisticsInfo> listUmsMemberStatisticsInfo();

    /**
     * @description 根据id获取单条数据
     * @author Orall
     * @date 2022-10-17
     */
    UmsMemberStatisticsInfo getUmsMemberStatisticsInfoById(Long id);

    /**
     * @description 分页查询数据
     * @author Orall
     * @date 2022-10-17
     */
    List<UmsMemberStatisticsInfo> listUmsMemberStatisticsInfoByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author Orall
     * @date 2022-10-17
     */
    int insertUmsMemberStatisticsInfo(UmsMemberStatisticsInfo umsMemberStatisticsInfo);

    /**
     * @description 根据id修改数据
     * @author Orall
     * @date 2022-10-17
     */
    int updateUmsMemberStatisticsInfoById(UmsMemberStatisticsInfo umsMemberStatisticsInfo);

    /**
     * @description 根据id删除数据
     * @author Orall
     * @date 2022-10-17
     */
    int deleteUmsMemberStatisticsInfoById(Long id);
}