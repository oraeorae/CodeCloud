package com.example.mycloudauth.dao;

import com.example.mycloudauth.pojo.UmsMemberCollectSubject;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author Orall
 * @version 1.0
 * @description UmsMemberCollectSubject的Mapper类
 * @date 2022-10-14
 */

@Mapper
public interface UmsMemberCollectSubjectMapper {
    /**
     * @return 以列表形式返回UmsMemberCollectSubject实体类
     * @description 查询所有数据
     * @author Orall
     * @data 2022-10-14
     */
    @Select("select * from ums_member_collect_subject")
    List<UmsMemberCollectSubject> listUmsMemberCollectSubject();

    /**
     * @param id 主键id
     * @return 返回UmsMemberCollectSubject实体类
     * @description 根据id获取单条数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-14
     */
    @Select("select * from ums_member_collect_subject where id=#{id}")
    UmsMemberCollectSubject getUmsMemberCollectSubjectById(Long id);

    /**
     * @param first 查询结果的索引值（默认从0开始）
     * @param second 查询结果返回的数量
     * @return 以列表形式返回UmsMemberCollectSubject实体类
     * @description 分页查询数据（备注：这里的*换成对应想要获取的数据）
     * @author Orall
     * @data 2022-10-14
     */
    @Select("select * from ums_member_collect_subject limit #{first},#{second};")
    List<UmsMemberCollectSubject> listUmsMemberCollectSubjectByPage(int first, int second);

    /**
     * @param umsMemberCollectSubject 插入的实体类
     * @return 新增数据的ID
     * @description 插入数据
     * @author Orall
     * @data 2022-10-14
     */
    @Insert("insert into ums_member_collect_subject(subject_id,subject_name,subject_img,subject_urll) values(#{subject_id},#{subject_name},#{subject_img},#{subject_urll})")
    int insertUmsMemberCollectSubject(UmsMemberCollectSubject umsMemberCollectSubject);

    /**
     * @param umsMemberCollectSubject 要修改的实体类
     * @return 修改数据的条数
     * @description 根据id修改数据（备注：这里要修改的内容要根据实际改一下）
     * @author Orall
     * @data 2022-10-14
     */
    @Update("update ums_member_collect_subject set subject_id = subject_id where id=#{id}")
    int updateUmsMemberCollectSubjectById(UmsMemberCollectSubject umsMemberCollectSubject);

    /**
     * @param id 主键id
     * @return 删除数据的条数
     * @description 根据id删除数据
     * @author Orall
     * @since 2022-10-14
     */
    @Delete("delete from ums_member_collect_subject where id=#{id}")
    int deleteUmsMemberCollectSubjectById(Long id);

}