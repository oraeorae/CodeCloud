package com.example.mycloudauth.dao;

import com.example.mycloudauth.pojo.UmsMemberLevel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberLevel的Mapper类
 * @date 2022-10-14
 */

@Mapper
public interface UmsMemberLevelMapper {
    /**
     * @return 以列表形式返回UmsMemberLevel实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-14
     */
    @Select("select * from ums_member_level")
    List<UmsMemberLevel> listUmsMemberLevel();

    /**
     * @param id 主键id
     * @return 返回UmsMemberLevel实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-14
     */
    @Select("select * from ums_member_level where id=#{id}")
    UmsMemberLevel getUmsMemberLevelById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回UmsMemberLevel实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-14
     */
    @Select("select * from ums_member_level limit #{first},#{second};")
    List<UmsMemberLevel> listUmsMemberLevelByPage(int first, int second);

    /**
     * @param umsMemberLevel 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-14
     */
    @Insert("insert into ums_member_level(name,growth_point,default_status,free_freight_point,comment_growth_point,priviledge_free_freight,priviledge_member_price,priviledge_birthday,note) values(#{name},#{growth_point},#{default_status},#{free_freight_point},#{comment_growth_point},#{priviledge_free_freight},#{priviledge_member_price},#{priviledge_birthday},#{note})")
    int insertUmsMemberLevel(UmsMemberLevel umsMemberLevel);

    /**
     * @param umsMemberLevel 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-14
     */
    @Update("update ums_member_level set name = name where id=#{id}")
    int updateUmsMemberLevelById(UmsMemberLevel umsMemberLevel);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-14
     */
    @Delete("delete from ums_member_level where id=#{id}")
    int deleteUmsMemberLevelById(Long id);

}