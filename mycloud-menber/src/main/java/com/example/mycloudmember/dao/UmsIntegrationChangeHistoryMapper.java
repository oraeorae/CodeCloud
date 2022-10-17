package com.example.mycloudmember.dao;

import com.example.mycloudmember.pojo.UmsIntegrationChangeHistory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description UmsIntegrationChangeHistory的Mapper类
 * @date 2022-10-17
 */

@Mapper
public interface UmsIntegrationChangeHistoryMapper {
    /**
     * @return 以列表形式返回UmsIntegrationChangeHistory实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_integration_change_history")
    List<UmsIntegrationChangeHistory> listUmsIntegrationChangeHistory();

    /**
     * @param id 主键id
     * @return 返回UmsIntegrationChangeHistory实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_integration_change_history where id=#{id}")
    UmsIntegrationChangeHistory getUmsIntegrationChangeHistoryById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回UmsIntegrationChangeHistory实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-17
     */
    @Select("select * from ums_integration_change_history limit #{first},#{second};")
    List<UmsIntegrationChangeHistory> listUmsIntegrationChangeHistoryByPage(int first, int second);

    /**
     * @param umsIntegrationChangeHistory 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-17
     */
    @Insert("insert into ums_integration_change_history(member_id,create_time,change_count,note,source_tyoe) values(#{member_id},#{create_time},#{change_count},#{note},#{source_tyoe})")
    int insertUmsIntegrationChangeHistory(UmsIntegrationChangeHistory umsIntegrationChangeHistory);

    /**
     * @param umsIntegrationChangeHistory 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-17
     */
    @Update("update ums_integration_change_history set member_id = member_id where id=#{id}")
    int updateUmsIntegrationChangeHistoryById(UmsIntegrationChangeHistory umsIntegrationChangeHistory);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-17
     */
    @Delete("delete from ums_integration_change_history where id=#{id}")
    int deleteUmsIntegrationChangeHistoryById(Long id);

}