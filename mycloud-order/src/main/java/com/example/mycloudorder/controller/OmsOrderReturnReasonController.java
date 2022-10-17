package com.example.mycloudorder.controller;

import com.example.mycloudorder.pojo.OmsOrderReturnReason;
import com.example.mycloudorder.service.OmsOrderReturnReasonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import mycloudcommon.utils.R;

/**
* @author Orall
* @version 1.0
* @description OmsOrderReturnReason的Controller层
* @data 2022-10-16
*/
@RestController
@RequestMapping(value = "/api/omsOrderReturnReason")
public class OmsOrderReturnReasonController {
    @Autowired
    OmsOrderReturnReasonService omsOrderReturnReasonService;

    /**
    * @param omsOrderReturnReason 添加的实体类
    * @return R 自定义响应体
    * @description 添加数据
    * @author Orall
    * @data 2022-10-16
    */
    @PostMapping("/insert")
    @ApiOperation(value = "添加数据")
    public R insertOmsOrderReturnReason(@Valid OmsOrderReturnReason omsOrderReturnReason) {
        try {
            if( omsOrderReturnReasonService.insertOmsOrderReturnReason(omsOrderReturnReason) >= 1 ){
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
     * @data 2022-10-16
     */
    @GetMapping("/get")
    @ApiOperation(value = "根据id获取单条数据")
    public R getOmsOrderReturnReasonById(@RequestParam("id") Long id) {
        try {
            return R.ok(omsOrderReturnReasonService.getOmsOrderReturnReasonById(id));
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
     * @data 2022-10-16
     */
    @GetMapping("/list/page")
    @ApiOperation(value = "分页查询数据")
    public R listOmsOrderReturnReasonByPage(@RequestParam("page") int page) {
        try {
            //limit默认为10
            return R.ok(omsOrderReturnReasonService.listOmsOrderReturnReasonByPage(page,10));
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("服务器内部错误：" + e.toString());
        }
    }

    /**
     * @param omsOrderReturnReason 需要修改的实体类
     * @return R 自定义响应体
     * @description 根据id修改数据
     * @author Orall
     * @data 2022-10-16
     */
    @PutMapping("/update")
    @ApiOperation(value = "根据id修改数据")
    public R updateOmsOrderReturnReasonById(@Valid OmsOrderReturnReason omsOrderReturnReason) {
        try {
            if( omsOrderReturnReasonService.updateOmsOrderReturnReasonById(omsOrderReturnReason) >= 1 ){
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
     * @data 2022-10-16
     */
    @GetMapping("/list")
    @ApiOperation(value = "查询所有数据")
    public R listOmsOrderReturnReason() {
        try {
            return R.ok(omsOrderReturnReasonService.listOmsOrderReturnReason());
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
     * @data 2022-10-16
     */
    @DeleteMapping("/delete")
    @ApiOperation(value = "删除数据")
    public R deleteOmsOrderReturnReasonById(@RequestParam("id") Long id) {
        try {
            if( omsOrderReturnReasonService.deleteOmsOrderReturnReasonById(id) >= 1 ){
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