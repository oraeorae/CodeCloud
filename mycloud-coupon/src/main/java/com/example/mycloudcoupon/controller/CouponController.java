package com.example.mycloudcoupon.controller;

import com.example.mycloudcoupon.pojo.SmsCoupon;
import com.example.mycloudcoupon.service.SmsCouponService;
import mycloudcommon.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private SmsCouponService couponService;

    @RequestMapping("/member/list")
    public R membercoupons(){    //全系统的所有返回都返回R
        // 应该去数据库查用户对于的优惠券，但这个我们简化了，不去数据库查了，构造了一个优惠券给他返回
        SmsCoupon couponEntity = new SmsCoupon();
        couponEntity.setCouponName("满100-10");//优惠券的名字
        return R.ok().put("coupons", Arrays.asList(couponEntity));
    }
}
