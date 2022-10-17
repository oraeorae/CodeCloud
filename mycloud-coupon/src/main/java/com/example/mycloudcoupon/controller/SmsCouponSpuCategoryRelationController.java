package com.example.mycloudcoupon.controller;

import com.example.mycloudcoupon.pojo.SmsCouponSpuCategoryRelation;
import com.example.mycloudcoupon.service.SmsCouponSpuCategoryRelationService;
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
import mycloudcommon.utils.R;


/**
* @author Orall
* @version 1.0
* @description SmsCouponSpuCategoryRelation的Controller层
* @data 2022-10-17
*/
@RestController
@RequestMapping(value = "/api/smsCouponSpuCategoryRelation")
public class SmsCouponSpuCategoryRelationController {
    @Autowired
    SmsCouponSpuCategoryRelationService smsCouponSpuCategoryRelationService;

    /**
    * @param smsCouponSpuCategoryRelation 添加的实体类
    * @return R 自定义响应体
    * @description 添加数据
    * @author Orall
    * @data 2022-10-17
    */
    @PostMapping("/insert")
    @ApiOperation(value = "添加数据")
    public R insertSmsCouponSpuCategoryRelation(@Valid SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        try {
            if( smsCouponSpuCategoryRelationService.insertSmsCouponSpuCategoryRelation(smsCouponSpuCategoryRelation) >= 1 ){
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
    public R getSmsCouponSpuCategoryRelationById(@RequestParam("id") Long id) {
        try {
            return R.ok(smsCouponSpuCategoryRelationService.getSmsCouponSpuCategoryRelationById(id));
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
    public R listSmsCouponSpuCategoryRelationByPage(@RequestParam("page") int page) {
        try {
            //limit默认为10
            return R.ok(smsCouponSpuCategoryRelationService.listSmsCouponSpuCategoryRelationByPage(page,10));
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("服务器内部错误：" + e.toString());
        }
    }

    /**
     * @param smsCouponSpuCategoryRelation 需要修改的实体类
     * @return R 自定义响应体
     * @description 根据id修改数据
     * @author Orall
     * @data 2022-10-17
     */
    @PutMapping("/update")
    @ApiOperation(value = "根据id修改数据")
    public R updateSmsCouponSpuCategoryRelationById(@Valid SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        try {
            if( smsCouponSpuCategoryRelationService.updateSmsCouponSpuCategoryRelationById(smsCouponSpuCategoryRelation) >= 1 ){
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
    public R listSmsCouponSpuCategoryRelation() {
        try {
            return R.ok(smsCouponSpuCategoryRelationService.listSmsCouponSpuCategoryRelation());
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
    public R deleteSmsCouponSpuCategoryRelationById(@RequestParam("id") Long id) {
        try {
            if( smsCouponSpuCategoryRelationService.deleteSmsCouponSpuCategoryRelationById(id) >= 1 ){
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