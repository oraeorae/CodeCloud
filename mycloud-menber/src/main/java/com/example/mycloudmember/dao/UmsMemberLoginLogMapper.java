package com.example.mycloudmember.dao;

import com.example.mycloudmember.pojo.UmsMemberLoginLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberLoginLog的Mapper类
 * @date 2022-10-17
 */

@Mapper
public interface UmsMemberLoginLogMapper {
    /**
     * @return 以列表形式返回UmsMemberLoginLog实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_member_login_log")
    List<UmsMemberLoginLog> listUmsMemberLoginLog();

    /**
     * @param id 主键id
     * @return 返回UmsMemberLoginLog实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_member_login_log where id=#{id}")
    UmsMemberLoginLog getUmsMemberLoginLogById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回UmsMemberLoginLog实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_member_login_log limit #{first},#{second};")
    List<UmsMemberLoginLog> listUmsMemberLoginLogByPage(int first, int second);

    /**
     * @param umsMemberLoginLog 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-17
     */
    @Insert("insert into ums_member_login_log(member_id,create_time,ip,city,login_type) values(#{member_id},#{create_time},#{ip},#{city},#{login_type})")
    int insertUmsMemberLoginLog(UmsMemberLoginLog umsMemberLoginLog);

    /**
     * @param umsMemberLoginLog 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-17
     */
    @Update("update ums_member_login_log set member_id = member_id where id=#{id}")
    int updateUmsMemberLoginLogById(UmsMemberLoginLog umsMemberLoginLog);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-17
     */
    @Delete("delete from ums_member_login_log where id=#{id}")
    int deleteUmsMemberLoginLogById(Long id);

}