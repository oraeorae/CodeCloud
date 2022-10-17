package com.example.mycloudorder.dao;

import com.example.mycloudorder.pojo.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description OmsOrderReturnApply的Mapper类
 * @date 2022-10-16
 */

@Mapper
public interface OmsOrderReturnApplyMapper {
    /**
     * @return 以列表形式返回OmsOrderReturnApply实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order_return_apply")
    List<OmsOrderReturnApply> listOmsOrderReturnApply();

    /**
     * @param id 主键id
     * @return 返回OmsOrderReturnApply实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order_return_apply where id=#{id}")
    OmsOrderReturnApply getOmsOrderReturnApplyById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回OmsOrderReturnApply实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_order_return_apply limit #{first},#{second};")
    List<OmsOrderReturnApply> listOmsOrderReturnApplyByPage(int first, int second);

    /**
     * @param omsOrderReturnApply 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-16
     */
    @Insert("insert into oms_order_return_apply(order_id,sku_id,order_sn,create_time,member_username,return_amount,return_name,return_phone,status,handle_time,sku_img,sku_name,sku_brand,sku_attrs_vals,sku_count,sku_price,sku_real_price,reason,description述,desc_pics,handle_note,handle_man) values(#{order_id},#{sku_id},#{order_sn},#{create_time},#{member_username},#{return_amount},#{return_name},#{return_phone},#{status},#{handle_time},#{sku_img},#{sku_name},#{sku_brand},#{sku_attrs_vals},#{sku_count},#{sku_price},#{sku_real_price},#{reason},#{description述},#{desc_pics},#{handle_note},#{handle_man})")
    int insertOmsOrderReturnApply(OmsOrderReturnApply omsOrderReturnApply);

    /**
     * @param omsOrderReturnApply 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-16
     */
    @Update("update oms_order_return_apply set order_id = order_id where id=#{id}")
    int updateOmsOrderReturnApplyById(OmsOrderReturnApply omsOrderReturnApply);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-16
     */
    @Delete("delete from oms_order_return_apply where id=#{id}")
    int deleteOmsOrderReturnApplyById(Long id);

}