package com.example.mycloudmember.dao;

import com.example.mycloudmember.pojo.UmsMember;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMember的Mapper类
 * @date 2022-10-17
 */

@Mapper
public interface UmsMemberMapper {
    /**
     * @return 以列表形式返回UmsMember实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_member")
    List<UmsMember> listUmsMember();

    /**
     * @param id 主键id
     * @return 返回UmsMember实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_member where id=#{id}")
    UmsMember getUmsMemberById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回UmsMember实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_member limit #{first},#{second};")
    List<UmsMember> listUmsMemberByPage(int first, int second);

    /**
     * @param umsMember 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-17
     */
    @Insert("insert into ums_member(level_id,username,password,nickname,mobile,email,header,gender,birth,city,job,sign,source_type,integration,growth,status,create_time) values(#{level_id},#{username},#{password},#{nickname},#{mobile},#{email},#{header},#{gender},#{birth},#{city},#{job},#{sign},#{source_type},#{integration},#{growth},#{status},#{create_time})")
    int insertUmsMember(UmsMember umsMember);

    /**
     * @param umsMember 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-17
     */
    @Update("update ums_member set level_id = level_id where id=#{id}")
    int updateUmsMemberById(UmsMember umsMember);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-17
     */
    @Delete("delete from ums_member where id=#{id}")
    int deleteUmsMemberById(Long id);

}