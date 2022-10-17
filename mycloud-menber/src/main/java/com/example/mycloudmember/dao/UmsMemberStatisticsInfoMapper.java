package com.example.mycloudmember.dao;

import com.example.mycloudmember.pojo.UmsMemberStatisticsInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberStatisticsInfo的Mapper类
 * @date 2022-10-17
 */

@Mapper
public interface UmsMemberStatisticsInfoMapper {
    /**
     * @return 以列表形式返回UmsMemberStatisticsInfo实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_member_statistics_info")
    List<UmsMemberStatisticsInfo> listUmsMemberStatisticsInfo();

    /**
     * @param id 主键id
     * @return 返回UmsMemberStatisticsInfo实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_member_statistics_info where id=#{id}")
    UmsMemberStatisticsInfo getUmsMemberStatisticsInfoById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回UmsMemberStatisticsInfo实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_member_statistics_info limit #{first},#{second};")
    List<UmsMemberStatisticsInfo> listUmsMemberStatisticsInfoByPage(int first, int second);

    /**
     * @param umsMemberStatisticsInfo 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-17
     */
    @Insert("insert into ums_member_statistics_info(member_id,consume_amount,coupon_amount,order_count,coupon_count,comment_count,return_order_count,login_count,attend_count,fans_count,collect_product_count,collect_subject_count,collect_comment_count,invite_friend_count) values(#{member_id},#{consume_amount},#{coupon_amount},#{order_count},#{coupon_count},#{comment_count},#{return_order_count},#{login_count},#{attend_count},#{fans_count},#{collect_product_count},#{collect_subject_count},#{collect_comment_count},#{invite_friend_count})")
    int insertUmsMemberStatisticsInfo(UmsMemberStatisticsInfo umsMemberStatisticsInfo);

    /**
     * @param umsMemberStatisticsInfo 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-17
     */
    @Update("update ums_member_statistics_info set member_id = member_id where id=#{id}")
    int updateUmsMemberStatisticsInfoById(UmsMemberStatisticsInfo umsMemberStatisticsInfo);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-17
     */
    @Delete("delete from ums_member_statistics_info where id=#{id}")
    int deleteUmsMemberStatisticsInfoById(Long id);

}