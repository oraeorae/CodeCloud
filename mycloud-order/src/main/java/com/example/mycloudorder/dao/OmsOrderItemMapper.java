package com.example.mycloudorder.dao;

import com.example.mycloudorder.pojo.OmsOrderItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description OmsOrderItem的Mapper类
 * @date 2022-10-16
 */

@Mapper
public interface OmsOrderItemMapper {
    /**
     * @return 以列表形式返回OmsOrderItem实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order_item")
    List<OmsOrderItem> listOmsOrderItem();

    /**
     * @param id 主键id
     * @return 返回OmsOrderItem实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order_item where id=#{id}")
    OmsOrderItem getOmsOrderItemById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回OmsOrderItem实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order_item limit #{first},#{second};")
    List<OmsOrderItem> listOmsOrderItemByPage(int first, int second);

    /**
     * @param omsOrderItem 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-16
     */
    @Insert("insert into oms_order_item(order_id,order_sn,spu_id,spu_name,spu_pic,spu_brand,category_id,sku_id,sku_name,sku_pic,sku_price,sku_quantity,sku_attrs_vals,promotion_amount,coupon_amount,integration_amount,real_amount,gift_integration,gift_growth) values(#{order_id},#{order_sn},#{spu_id},#{spu_name},#{spu_pic},#{spu_brand},#{category_id},#{sku_id},#{sku_name},#{sku_pic},#{sku_price},#{sku_quantity},#{sku_attrs_vals},#{promotion_amount},#{coupon_amount},#{integration_amount},#{real_amount},#{gift_integration},#{gift_growth})")
    int insertOmsOrderItem(OmsOrderItem omsOrderItem);

    /**
     * @param omsOrderItem 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-16
     */
    @Update("update oms_order_item set order_id = order_id where id=#{id}")
    int updateOmsOrderItemById(OmsOrderItem omsOrderItem);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-16
     */
    @Delete("delete from oms_order_item where id=#{id}")
    int deleteOmsOrderItemById(Long id);

}