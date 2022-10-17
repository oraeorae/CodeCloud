package com.example.mycloudorder.config;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.example.mycloudorder.pojo.PayVo;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "alipay")
@Component
@Data
public class AlipayTemplate {
    //在支付宝创建的应用的id
    private String app_id = "2021000121679487";

    // 商户私钥，您的PKCS8格式RSA2私钥
    private String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCJ3DRipZZzZgQO2a1pm1bVGVwuNMC3vOId1WZz0JJmjtf88IMspqpNb7dj8V8GPzGFmhVh89z6OO4Xj+E413sgad3/MLTVr3Py0/YuVyCXItsZOilkgCXQwdnYoWTS0b4HOBKuX8T4uvbW3k+EshdBkM0SXxNxh3YP44+nlS8GTGmQfuMMCWvWSMk0E2N5ZF8+tceBBX7PS3LDut/wEXPjNSESCEBnhBkqmOmEdoous3hQdLLQKc+nEfp8lywlH7WmycPfX/hVaMiMi16q09mcsvTzCV9bTBHQ9uLo0oN73tz6HyrFcLRs8pStZOl/q3Op6yBKNmYFMC9dBr22GNPBAgMBAAECggEAYp7f7s3sYiNRtdns30acCJg6xGdCkm6SB6uYvjMv+CQpyS25eSDFZd4MgHe0dcCRSbUfpNISfAJr+PkZslMcJuT1RdBvHQqF1OnjC+WST+xEdriP0fCGnN+AWyOh/9rBqWJoosuqGhGN8cpZcmEAmAvhWEohm66/O8CcDNOBL2w/s3JefMoo7TCzDFz7VVLZ1ytIzqeS8XysloNDRl21UU42GmkC9pJj2mJKKsVX9G4P7c+3VuzL3xVUyHLRan0uvTQjPvIpPCRkzdTuMzbznmyWRRnjQ6WDrkmif/W9/+ocfcuynkKddrn2TO4u2ZjhRaUSaX8ANUvFZuznmEyAEQKBgQC8LWHCFVgXAS4I4oxq5cL0YrMOsT2nNncSKk0+nTwYhBQxLWQfH2kLda8h0JLsDXDtMcyq6XAM//KWTAXRsk2BEsON9ZiR5tjLRoR/pko8zCeI+qJhU6TS+dZSWXhLTjz8JDd+Upa/frIerDKu8SNsnBydAyCCgSELLr4PvXwCXQKBgQC7jDKM3wjij4qApPZFoz2mR4Z3FGTaThWRk/73IsP+nDd8fr0OANWnrMP4IXMFL3DE7Ju3gn5mxXQ8XkM6BHwnVxCkmbz1dydYtOxv62s7VsVlgcTOMwbHY8IUPWEqUPBNxWWrjakjBogpTZF1lyIJ9Lxxq5T5yYbHxq0z5bVItQKBgC3J8S6z2OKII/Z/geGFFQI4fg+GK1Vj2GdwKamhwvzILs2kmOdF0l66fSoCQa30u1TMOFwiP2S6ZwIRb50OAPP2Z+VELKLcBEa6WwVgplHS74/SRO7f1oyLxI33PWE9oXNNML+pQwtHvfnettqAzLjh58iA+UkoOK0q646S8fj1AoGBAJtBkzNVC3jqlSCr7wd0/HsjaOg5JMgnrelG1+HkkNW8op5YGM9312coOU62+g3H2RXcPYgr6dHQEcpLymFEBzdV9vwcHPYjfpoLpFN+UtXbnivKwo5kZW84YRj6Ou6Z9GSdTe43plXNeXifsxPiWhZd2IZNIVWrA/1rtkRpG6qlAoGAD+U7AOnjUnfQqX+RirgL+YoTtcolTReq6lNjRBFhl4dypUCUjY66UurfeCL/PivbThvqPX+7zLWSd/gsQYaN2p3yLYIgtbE9+qe2r7VgnPxmZrvZxZ+NzcY1QGk/Be1KkpCqKp+Lf/IY1h/k0qmb+VWiWDIe8FO5zO8BE+lHi4Y=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    private String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4onivo4qSTHMNRezkOajhyU0BF61J43RiCV9WAZ6eJ6QG2V2mhYaQGRGwSOgHBpvCp1c1lHxeabaNVXKhcOnHkPJUo46tuIAm0+pHWTQo7MVHslU5qycmUT9m+AB3IWoXKzFKuwDSHuQsyVNl5TB0SL65tESZgafZqSrectIwL6GvK4+2NxgRK+dpIG7s5CpU2aT8KHvT33w6+0mVnwqzO1Fi52dO1kl83apqN2/QQbGR2S9FmvOCD/+AHvLB6+/UyfaQnf/Is4yOu0jwD8RR9nUt9nZ9ZB6xJ0VShjSgjNd+Gh6QabspdJOMeYVJKmj+vAfR6y2e79zLqH+rIqhCQIDAQAB";
    // 服务器[异步通知]页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    // 支付宝会悄悄的给我们发送一个请求，告诉我们支付成功的信息
    private String notify_url;

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    //同步通知，支付成功，一般跳转到成功页
    private String return_url;

    // 签名方式
    private String sign_type = "RSA2";

    // 字符编码格式
    private String charset = "utf-8";

    //订单超时时间
    private String timeout = "1m";

    // 支付宝网关； https://openapi.alipaydev.com/gateway.do
    private String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";


    public String pay(PayVo vo) throws AlipayApiException {

        //AlipayClient alipayClient = new DefaultAlipayClient(AlipayTemplate.gatewayUrl, AlipayTemplate.app_id, AlipayTemplate.merchant_private_key, "json", AlipayTemplate.charset, AlipayTemplate.alipay_public_key, AlipayTemplate.sign_type);
        //1、根据支付宝的配置生成一个支付客户端
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl,
                app_id, merchant_private_key, "json",
                charset, alipay_public_key, sign_type);

        //2、创建一个支付请求 //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(return_url);
        alipayRequest.setNotifyUrl(notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = vo.getOut_trade_no();
        //付款金额，必填
        String total_amount = vo.getTotal_amount();
        //订单名称，必填
        String subject = vo.getSubject();
        //商品描述，可空
        String body = vo.getBody();

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"timeout_express\":\""+timeout+"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        String result = alipayClient.pageExecute(alipayRequest).getBody();

        //会收到支付宝的响应，响应的是一个页面，只要浏览器显示这个页面，就会自动来到支付宝的收银台页面
        System.out.println("支付宝的响应：" + result);

        return result;
    }
}
