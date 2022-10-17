package com.example.autonewcode.pojo;

import lombok.Data;

@Data
public class Settings {
    private String project = "example";
    private String pPackage = "com.example.demo";
    private String projectComment;
    private String author = "Orall";
    private String path1 = "com";
    private String path2 = "example";
    private String path3 = "demo";
    private String pathAll;
    //controller层的返回值，请求成功或者失败对应的函数名（函数默认一个参数）
    private String returnValue = "Map<String, Object>";
    private String successFunction = "StatusCode.success";
    private String failFunction = "StatusCode.error";
    //主键类型
    private String keyType = "Integer";
    //文件名称
    private String daoName = "dao";
    private String controllerName = "controller";
    private String pojoName = "pojo";
    private String serviceName = "service";
    private String serviceImplName = "serviceImpl";



}
