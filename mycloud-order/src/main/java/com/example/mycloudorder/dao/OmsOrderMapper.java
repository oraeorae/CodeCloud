package com.example.mycloudorder.dao;

import com.example.mycloudorder.pojo.OmsOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description OmsOrder的Mapper类
 * @date 2022-10-16
 */

@Mapper
public interface OmsOrderMapper {
    /**
     * @return 以列表形式返回OmsOrder实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order")
    List<OmsOrder> listOmsOrder();

    /**
     * @param id 主键id
     * @return 返回OmsOrder实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order where id=#{id}")
    OmsOrder getOmsOrderById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回OmsOrder实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order limit #{first},#{second};")
    List<OmsOrder> listOmsOrderByPage(int first, int second);

    /**
     * @param omsOrder 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-16
     */
    @Insert("insert into oms_order(member_id,order_sn,coupon_id,create_time,member_username,total_amount,pay_amount,freight_amount,promotion_amount,integration_amount,coupon_amount,discount_amount,pay_type,source_type,status,auto_confirm_day,integration,growth,bill_type,note,confirm_status,delete_status,use_integration,payment_time,delivery_time,receive_time,comment_time,modify_time) values(#{member_id},#{order_sn},#{coupon_id},#{create_time},#{member_username},#{total_amount},#{pay_amount},#{freight_amount},#{promotion_amount},#{integration_amount},#{coupon_amount},#{discount_amount},#{pay_type},#{source_type},#{status},#{auto_confirm_day},#{integration},#{growth},#{bill_type},#{note},#{confirm_status},#{delete_status},#{use_integration},#{payment_time},#{delivery_time},#{receive_time},#{comment_time},#{modify_time})")
    int insertOmsOrder(OmsOrder omsOrder);

    /**
     * @param omsOrder 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-16
     */
    @Update("update oms_order set member_id = member_id where id=#{id}")
    int updateOmsOrderById(OmsOrder omsOrder);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-16
     */
    @Delete("delete from oms_order where id=#{id}")
    int deleteOmsOrderById(Long id);

}