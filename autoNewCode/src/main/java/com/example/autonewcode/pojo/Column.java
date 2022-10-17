package com.example.autonewcode.pojo;

import lombok.Data;

@Data       //使用这个注解可以省去代码中大量的get()、 set()、 toString()等方法；
public class Column {
    //列名称
    private String columnName;
    //处理后的列名称
    private String columnName2;
    //列类型
    private String columnType;
    //列在数据库中的类型
    private String columnDbType;
    //本工程暂不处理备注和主键
    //列备注id
    private String columnComment;
    //是否是主键
    private String columnKey;
}
