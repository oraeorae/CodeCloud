package com.example.mycloudorder.dao;

import com.example.mycloudorder.pojo.OmsOrderReturnReason;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description OmsOrderReturnReason的Mapper类
 * @date 2022-10-16
 */

@Mapper
public interface OmsOrderReturnReasonMapper {
    /**
     * @return 以列表形式返回OmsOrderReturnReason实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order_return_reason")
    List<OmsOrderReturnReason> listOmsOrderReturnReason();

    /**
     * @param id 主键id
     * @return 返回OmsOrderReturnReason实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order_return_reason where id=#{id}")
    OmsOrderReturnReason getOmsOrderReturnReasonById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回OmsOrderReturnReason实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order_return_reason limit #{first},#{second};")
    List<OmsOrderReturnReason> listOmsOrderReturnReasonByPage(int first, int second);

    /**
     * @param omsOrderReturnReason 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-16
     */
    @Insert("insert into oms_order_return_reason(name,sort,status,create_time) values(#{name},#{sort},#{status},#{create_time})")
    int insertOmsOrderReturnReason(OmsOrderReturnReason omsOrderReturnReason);

    /**
     * @param omsOrderReturnReason 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-16
     */
    @Update("update oms_order_return_reason set name = name where id=#{id}")
    int updateOmsOrderReturnReasonById(OmsOrderReturnReason omsOrderReturnReason);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-16
     */
    @Delete("delete from oms_order_return_reason where id=#{id}")
    int deleteOmsOrderReturnReasonById(Long id);

}