package com.example.mycloudorder.controller;

import com.alipay.api.AlipayApiException;
import com.example.mycloudorder.config.AlipayTemplate;
import com.example.mycloudorder.pojo.PayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PayWebController {
    @Autowired
    AlipayTemplate alipayTemplate;

    @ResponseBody
    @GetMapping(value = "/payOrder",produces = "text/html")
    public String payOrder(@RequestParam("orderSn") String orderSn) throws AlipayApiException {
        PayVo payVo = new PayVo();
        //商户订单号，商户网站订单系统中唯一订单号，必填
        payVo.setOut_trade_no("121");
        //付款金额，必填
        payVo.setTotal_amount("211");
        //订单名称，必填
        payVo.setSubject("asdq");
        String pay = alipayTemplate.pay(payVo);
        return pay;
    }

}
