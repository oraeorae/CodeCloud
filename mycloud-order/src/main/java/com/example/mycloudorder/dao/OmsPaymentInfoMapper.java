package com.example.mycloudorder.dao;

import com.example.mycloudorder.pojo.OmsPaymentInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description OmsPaymentInfo的Mapper类
 * @date 2022-10-16
 */

@Mapper
public interface OmsPaymentInfoMapper {
    /**
     * @return 以列表形式返回OmsPaymentInfo实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_payment_info")
    List<OmsPaymentInfo> listOmsPaymentInfo();

    /**
     * @param id 主键id
     * @return 返回OmsPaymentInfo实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_payment_info where id=#{id}")
    OmsPaymentInfo getOmsPaymentInfoById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回OmsPaymentInfo实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-16
     */
    @Select("select * from oms_payment_info limit #{first},#{second};")
    List<OmsPaymentInfo> listOmsPaymentInfoByPage(int first, int second);

    /**
     * @param omsPaymentInfo 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-16
     */
    @Insert("insert into oms_payment_info(order_sn,order_id,alipay_trade_no,total_amount,subject,payment_status,create_time,confirm_time,callback_content,callback_time) values(#{order_sn},#{order_id},#{alipay_trade_no},#{total_amount},#{subject},#{payment_status},#{create_time},#{confirm_time},#{callback_content},#{callback_time})")
    int insertOmsPaymentInfo(OmsPaymentInfo omsPaymentInfo);

    /**
     * @param omsPaymentInfo 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-16
     */
    @Update("update oms_payment_info set order_sn = order_sn where id=#{id}")
    int updateOmsPaymentInfoById(OmsPaymentInfo omsPaymentInfo);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-16
     */
    @Delete("delete from oms_payment_info where id=#{id}")
    int deleteOmsPaymentInfoById(Long id);

}