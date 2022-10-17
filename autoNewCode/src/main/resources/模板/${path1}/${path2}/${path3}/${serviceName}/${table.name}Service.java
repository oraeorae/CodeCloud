package ${pPackage}.${serviceName};

import ${pPackage}.${pojoName}.<#list table.name?split('_') as s>${s?cap_first}</#list>;
import java.util.List;

/**
 * @author ${author}
 * @version 1.0
 * @description: 用于<#list table.name?split('_') as s>${s?cap_first}</#list>的Service提供接口
 * @date ${.now?date}
 */
public interface <#list table.name?split('_') as s>${s?cap_first}</#list>Service {

    /**
     * @description 查询所有数据
     * @author ${author}
     * @date ${.now?date}
     */
    List<<#list table.name?split('_') as s>${s?cap_first}</#list>> list<#list table.name?split('_') as s>${s?cap_first}</#list>();

    /**
     * @description 根据id获取单条数据
     * @author ${author}
     * @date ${.now?date}
     */
    <#list table.name?split('_') as s>${s?cap_first}</#list> get<#list table.name?split('_') as s>${s?cap_first}</#list>By${table.key?cap_first}(${keyType} ${table.key?lower_case});

    /**
     * @description 分页查询数据
     * @author ${author}
     * @date ${.now?date}
     */
    List<<#list table.name?split('_') as s>${s?cap_first}</#list>> list<#list table.name?split('_') as s>${s?cap_first}</#list>ByPage(int page, int limit);

    /**
     * @description 插入数据
     * @author ${author}
     * @date ${.now?date}
     */
    int insert<#list table.name?split('_') as s>${s?cap_first}</#list>(<#list table.name?split('_') as s>${s?cap_first}</#list> <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>);

    /**
     * @description 根据id修改数据
     * @author ${author}
     * @date ${.now?date}
     */
    int update<#list table.name?split('_') as s>${s?cap_first}</#list>By${table.key?cap_first}(<#list table.name?split('_') as s>${s?cap_first}</#list> <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>);

    /**
     * @description 根据id删除数据
     * @author ${author}
     * @date ${.now?date}
     */
    int delete<#list table.name?split('_') as s>${s?cap_first}</#list>By${table.key?cap_first}(${keyType} ${table.key?lower_case});
}