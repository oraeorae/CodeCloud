package com.example.mycloudcoupon.dao;

import com.example.mycloudcoupon.pojo.SmsSkuLadder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description SmsSkuLadder的Mapper类
 * @date 2022-10-17
 */

@Mapper
public interface SmsSkuLadderMapper {
    /**
     * @return 以列表形式返回SmsSkuLadder实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_sku_ladder")
    List<SmsSkuLadder> listSmsSkuLadder();

    /**
     * @param id 主键id
     * @return 返回SmsSkuLadder实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_sku_ladder where id=#{id}")
    SmsSkuLadder getSmsSkuLadderById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回SmsSkuLadder实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_sku_ladder limit #{first},#{second};")
    List<SmsSkuLadder> listSmsSkuLadderByPage(int first, int second);

    /**
     * @param smsSkuLadder 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-17
     */
    @Insert("insert into sms_sku_ladder(sku_id,full_count,discount,price,add_other) values(#{sku_id},#{full_count},#{discount},#{price},#{add_other})")
    int insertSmsSkuLadder(SmsSkuLadder smsSkuLadder);

    /**
     * @param smsSkuLadder 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-17
     */
    @Update("update sms_sku_ladder set sku_id = sku_id where id=#{id}")
    int updateSmsSkuLadderById(SmsSkuLadder smsSkuLadder);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-17
     */
    @Delete("delete from sms_sku_ladder where id=#{id}")
    int deleteSmsSkuLadderById(Long id);

}