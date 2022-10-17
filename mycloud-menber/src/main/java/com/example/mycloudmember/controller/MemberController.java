package com.example.mycloudmember.controller;

import com.example.mycloudmember.feign.CouponFeignService;
import com.example.mycloudmember.pojo.UmsMember;
import com.example.mycloudmember.service.UmsMemberService;
import mycloudcommon.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private UmsMemberService memberService;

    @Autowired
    CouponFeignService couponFeignService;

    @RequestMapping("/coupons")
    public R test(){
        UmsMember memberEntity = new UmsMember();
        memberEntity.setNickname("会员昵称张三");
        R membercoupons = couponFeignService.membercoupons();//假设张三去数据库查了后返回了张三的优惠券信息

        //打印会员和优惠券信息
        return R.ok().put("member",memberEntity).put("coupons",membercoupons.get("coupons"));
    }

}
