package ${pPackage}.${pojoName};

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author ${author}
 * @version 1.0
 * @description <#list table.name?split('_') as s>${s?cap_first}</#list>的实体类
 * @date ${.now?date}
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class <#list table.name?split('_') as s>${s?cap_first}</#list> {
<#list table.columnList as t>
    private ${t.columnType} <#list t.columnName?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>;
</#list>
}
