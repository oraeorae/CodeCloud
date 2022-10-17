package com.example.mycloudmember.controller;

import com.example.mycloudmember.pojo.UmsMemberCollectSubject;
import com.example.mycloudmember.service.UmsMemberCollectSubjectService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;

import mycloudcommon.utils.R;

/**
* @author Orall
* @version 1.0
* @description UmsMemberCollectSubject的Controller层
* @data 2022-10-17
*/
@RestController
@RequestMapping(value = "/api/umsMemberCollectSubject")
public class UmsMemberCollectSubjectController {
    @Autowired
    UmsMemberCollectSubjectService umsMemberCollectSubjectService;

    /**
    * @param umsMemberCollectSubject 添加的实体类
    * @return R 自定义响应体
    * @description 添加数据
    * @author Orall
    * @data 2022-10-17
    */
    @PostMapping("/insert")
    @ApiOperation(value = "添加数据")
    public R insertUmsMemberCollectSubject(@Valid UmsMemberCollectSubject umsMemberCollectSubject) {
        try {
            if( umsMemberCollectSubjectService.insertUmsMemberCollectSubject(umsMemberCollectSubject) >= 1 ){
                return R.ok("添加成功");
            }else{
                return R.ok("添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("服务器内部错误：" + e.toString());
        }
    }


    /**
     * @param id 主键id
     * @return R 自定义响应体
     * @description 根据id获取单条数据
     * @author Orall
     * @data 2022-10-17
     */
    @GetMapping("/get")
    @ApiOperation(value = "根据id获取单条数据")
    public R getUmsMemberCollectSubjectById(@RequestParam("id") Long id) {
        try {
            return R.ok(umsMemberCollectSubjectService.getUmsMemberCollectSubjectById(id));
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(3001, "服务器内部错误：" + e.toString());
        }
    }

    /**
     * @param page 查询的页数
     * @return R 自定义响应体
     * @description 分页查询数据（备注：limit默认为10）
     * @author Orall
     * @data 2022-10-17
     */
    @GetMapping("/list/page")
    @ApiOperation(value = "分页查询数据")
    public R listUmsMemberCollectSubjectByPage(@RequestParam("page") int page) {
        try {
            //limit默认为10
            return R.ok(umsMemberCollectSubjectService.listUmsMemberCollectSubjectByPage(page,10));
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("服务器内部错误：" + e.toString());
        }
    }

    /**
     * @param umsMemberCollectSubject 需要修改的实体类
     * @return R 自定义响应体
     * @description 根据id修改数据
     * @author Orall
     * @data 2022-10-17
     */
    @PutMapping("/update")
    @ApiOperation(value = "根据id修改数据")
    public R updateUmsMemberCollectSubjectById(@Valid UmsMemberCollectSubject umsMemberCollectSubject) {
        try {
            if( umsMemberCollectSubjectService.updateUmsMemberCollectSubjectById(umsMemberCollectSubject) >= 1 ){
                return R.ok("修改成功");
            }else{
                return R.ok("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("服务器内部错误：" + e.toString());
        }
    }

    /**
     * @return R 自定义响应体
     * @description 查询所有数据（备注：不常用）
     * @author Orall
     * @data 2022-10-17
     */
    @GetMapping("/list")
    @ApiOperation(value = "查询所有数据")
    public R listUmsMemberCollectSubject() {
        try {
            return R.ok(umsMemberCollectSubjectService.listUmsMemberCollectSubject());
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("服务器内部错误：" + e.toString());
        }
    }

    /**
     * @param id 主键id
     * @return R 自定义响应体
     * @description 根据id删除数据
     * @author Orall
     * @data 2022-10-17
     */
    @DeleteMapping("/delete")
    @ApiOperation(value = "删除数据")
    public R deleteUmsMemberCollectSubjectById(@RequestParam("id") Long id) {
        try {
            if( umsMemberCollectSubjectService.deleteUmsMemberCollectSubjectById(id) >= 1 ){
                return R.ok("删除成功");
            }else{
                return R.ok("删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("服务器内部错误：" + e.toString());
        }
    }

}