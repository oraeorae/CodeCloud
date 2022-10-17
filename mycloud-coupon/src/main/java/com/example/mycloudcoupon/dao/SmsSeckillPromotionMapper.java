package com.example.mycloudcoupon.dao;

import com.example.mycloudcoupon.pojo.SmsSeckillPromotion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description SmsSeckillPromotion的Mapper类
 * @date 2022-10-17
 */

@Mapper
public interface SmsSeckillPromotionMapper {
    /**
     * @return 以列表形式返回SmsSeckillPromotion实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_seckill_promotion")
    List<SmsSeckillPromotion> listSmsSeckillPromotion();

    /**
     * @param id 主键id
     * @return 返回SmsSeckillPromotion实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_seckill_promotion where id=#{id}")
    SmsSeckillPromotion getSmsSeckillPromotionById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回SmsSeckillPromotion实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_seckill_promotion limit #{first},#{second};")
    List<SmsSeckillPromotion> listSmsSeckillPromotionByPage(int first, int second);

    /**
     * @param smsSeckillPromotion 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-17
     */
    @Insert("insert into sms_seckill_promotion(title,start_time,end_time,status,create_time,user_id) values(#{title},#{start_time},#{end_time},#{status},#{create_time},#{user_id})")
    int insertSmsSeckillPromotion(SmsSeckillPromotion smsSeckillPromotion);

    /**
     * @param smsSeckillPromotion 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-17
     */
    @Update("update sms_seckill_promotion set title = title where id=#{id}")
    int updateSmsSeckillPromotionById(SmsSeckillPromotion smsSeckillPromotion);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-17
     */
    @Delete("delete from sms_seckill_promotion where id=#{id}")
    int deleteSmsSeckillPromotionById(Long id);

}