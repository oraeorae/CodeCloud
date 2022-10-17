package com.example.mycloudcoupon.dao;

import com.example.mycloudcoupon.pojo.SmsCoupon;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description SmsCoupon的Mapper类
 * @date 2022-10-17
 */

@Mapper
public interface SmsCouponMapper {
    /**
     * @return 以列表形式返回SmsCoupon实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_coupon")
    List<SmsCoupon> listSmsCoupon();

    /**
     * @param id 主键id
     * @return 返回SmsCoupon实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_coupon where id=#{id}")
    SmsCoupon getSmsCouponById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回SmsCoupon实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_coupon limit #{first},#{second};")
    List<SmsCoupon> listSmsCouponByPage(int first, int second);

    /**
     * @param smsCoupon 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-17
     */
    @Insert("insert into sms_coupon(coupon_type,coupon_img,coupon_name,num,amount,per_limit,min_point,start_time,end_time,use_type,note,publish_count,use_count,receive_count,enable_start_time,enable_end_time,code,member_level,publish) values(#{coupon_type},#{coupon_img},#{coupon_name},#{num},#{amount},#{per_limit},#{min_point},#{start_time},#{end_time},#{use_type},#{note},#{publish_count},#{use_count},#{receive_count},#{enable_start_time},#{enable_end_time},#{code},#{member_level},#{publish})")
    int insertSmsCoupon(SmsCoupon smsCoupon);

    /**
     * @param smsCoupon 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-17
     */
    @Update("update sms_coupon set coupon_type = coupon_type where id=#{id}")
    int updateSmsCouponById(SmsCoupon smsCoupon);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-17
     */
    @Delete("delete from sms_coupon where id=#{id}")
    int deleteSmsCouponById(Long id);

}