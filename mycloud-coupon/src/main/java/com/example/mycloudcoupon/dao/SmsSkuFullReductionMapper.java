package com.example.mycloudcoupon.dao;

import com.example.mycloudcoupon.pojo.SmsSkuFullReduction;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description SmsSkuFullReduction的Mapper类
 * @date 2022-10-17
 */

@Mapper
public interface SmsSkuFullReductionMapper {
    /**
     * @return 以列表形式返回SmsSkuFullReduction实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_sku_full_reduction")
    List<SmsSkuFullReduction> listSmsSkuFullReduction();

    /**
     * @param id 主键id
     * @return 返回SmsSkuFullReduction实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_sku_full_reduction where id=#{id}")
    SmsSkuFullReduction getSmsSkuFullReductionById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回SmsSkuFullReduction实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from sms_sku_full_reduction limit #{first},#{second};")
    List<SmsSkuFullReduction> listSmsSkuFullReductionByPage(int first, int second);

    /**
     * @param smsSkuFullReduction 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-17
     */
    @Insert("insert into sms_sku_full_reduction(sku_id,full_price,reduce_price,add_other) values(#{sku_id},#{full_price},#{reduce_price},#{add_other})")
    int insertSmsSkuFullReduction(SmsSkuFullReduction smsSkuFullReduction);

    /**
     * @param smsSkuFullReduction 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-17
     */
    @Update("update sms_sku_full_reduction set sku_id = sku_id where id=#{id}")
    int updateSmsSkuFullReductionById(SmsSkuFullReduction smsSkuFullReduction);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-17
     */
    @Delete("delete from sms_sku_full_reduction where id=#{id}")
    int deleteSmsSkuFullReductionById(Long id);

}