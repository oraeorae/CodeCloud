package com.example.mycloudorder.dao;

import com.example.mycloudorder.pojo.OmsRefundInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description OmsRefundInfo的Mapper类
 * @date 2022-10-16
 */

@Mapper
public interface OmsRefundInfoMapper {
    /**
     * @return 以列表形式返回OmsRefundInfo实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_refund_info")
    List<OmsRefundInfo> listOmsRefundInfo();

    /**
     * @param id 主键id
     * @return 返回OmsRefundInfo实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_refund_info where id=#{id}")
    OmsRefundInfo getOmsRefundInfoById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回OmsRefundInfo实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_refund_info limit #{first},#{second};")
    List<OmsRefundInfo> listOmsRefundInfoByPage(int first, int second);

    /**
     * @param omsRefundInfo 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-16
     */
    @Insert("insert into oms_refund_info(order_return_id,refund,refund_sn,refund_status,refund_channel,refund_content) values(#{order_return_id},#{refund},#{refund_sn},#{refund_status},#{refund_channel},#{refund_content})")
    int insertOmsRefundInfo(OmsRefundInfo omsRefundInfo);

    /**
     * @param omsRefundInfo 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-16
     */
    @Update("update oms_refund_info set order_return_id = order_return_id where id=#{id}")
    int updateOmsRefundInfoById(OmsRefundInfo omsRefundInfo);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-16
     */
    @Delete("delete from oms_refund_info where id=#{id}")
    int deleteOmsRefundInfoById(Long id);

}