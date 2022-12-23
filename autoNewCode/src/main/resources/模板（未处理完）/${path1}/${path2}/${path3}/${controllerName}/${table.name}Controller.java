package ${pPackage}.${controllerName};

import ${pPackage}.${pojoName}.<#list table.name?split('_') as s>${s?cap_first}</#list>;
import ${pPackage}.${serviceName}.<#list table.name?split('_') as s>${s?cap_first}</#list>Service;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Map;
import java.util.List;

/**
* @author ${author}
* @version 1.0
* @description <#list table.name?split('_') as s>${s?cap_first}</#list>的Controller层
* @data ${.now?date}
*/
@RestController
@RequestMapping(value = "/api/<#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>")
public class <#list table.name?split('_') as s>${s?cap_first}</#list>Controller {
    @Autowired
    <#list table.name?split('_') as s>${s?cap_first}</#list>Service <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>Service;

    /**
    * @param <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list> 添加的实体类
    * @return ${returnValue} 自定义响应体
    * @description 添加数据
    * @author ${author}
    * @data ${.now?date}
    */
    @PostMapping("/insert")
    @ApiOperation(value = "添加数据")
    public ${returnValue} insert<#list table.name?split('_') as s>${s?cap_first}</#list>(@Valid <#list table.name?split('_') as s>${s?cap_first}</#list> <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>) {
        return table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>Service.insert<#list table.name?split('_') as s>${s?cap_first}</#list>(<#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>);
    }


    /**
     * @param ${table.key?lower_case} 主键id
     * @return ${returnValue} 自定义响应体
     * @description 根据id获取单条数据
     * @author ${author}
     * @data ${.now?date}
     */
    @GetMapping("/get")
    @ApiOperation(value = "根据id获取单条数据")
    public ${returnValue} get<#list table.name?split('_') as s>${s?cap_first}</#list>By${table.key?cap_first}(@RequestParam("${table.key?lower_case}") ${keyType} ${table.key?lower_case}) {
        return <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>Service.get<#list table.name?split('_') as s>${s?cap_first}</#list>By${table.key?cap_first}(${table.key?lower_case});
    }

    /**
     * @param page 查询的页数
     * @return ${returnValue} 自定义响应体
     * @description 分页查询数据（备注：limit默认为10）
     * @author ${author}
     * @data ${.now?date}
     */
    @GetMapping("/list/page")
    @ApiOperation(value = "分页查询数据")
    public ${returnValue} list<#list table.name?split('_') as s>${s?cap_first}</#list>ByPage(@RequestParam("page") int page) {
        //limit默认为10
        return <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>Service.list<#list table.name?split('_') as s>${s?cap_first}</#list>ByPage(page,10);
    }

    /**
     * @param <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list> 需要修改的实体类
     * @return ${returnValue} 自定义响应体
     * @description 根据id修改数据
     * @author ${author}
     * @data ${.now?date}
     */
    @PutMapping("/update")
    @ApiOperation(value = "根据id修改数据")
    public ${returnValue} update<#list table.name?split('_') as s>${s?cap_first}</#list>By${table.key?cap_first}(@Valid <#list table.name?split('_') as s>${s?cap_first}</#list> <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>) {
        return <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>Service.update<#list table.name?split('_') as s>${s?cap_first}</#list>By${table.key?cap_first}(<#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>);
    }

    /**
     * @return ${returnValue} 自定义响应体
     * @description 查询所有数据（备注：不常用）
     * @author ${author}
     * @data ${.now?date}
     */
    @GetMapping("/list")
    @ApiOperation(value = "查询所有数据")
    public ${returnValue} list<#list table.name?split('_') as s>${s?cap_first}</#list>() {
        return <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>Service.list<#list table.name?split('_') as s>${s?cap_first}</#list>();
    }

    /**
     * @param ${table.key?lower_case} 主键id
     * @return ${returnValue} 自定义响应体
     * @description 根据id删除数据
     * @author ${author}
     * @data ${.now?date}
     */
    @DeleteMapping("/delete")
    @ApiOperation(value = "删除数据")
    public ${returnValue} delete<#list table.name?split('_') as s>${s?cap_first}</#list>By${table.key?cap_first}(@RequestParam("${table.key?lower_case}") ${keyType} ${table.key?lower_case}) {
        return <#list table.name?split('_') as s><#if s_index=0>${s?lower_case}<#else>${s?cap_first}</#if></#list>Service.delete<#list table.name?split('_') as s>${s?cap_first}</#list>By${table.key?cap_first}(${table.key?lower_case});
    }

}