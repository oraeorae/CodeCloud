package com.example.autonewcode.pojo;

import lombok.Data;

import java.util.List;

@Data       //使用这个注解可以省去代码中大量的get()、 set()、 toString()等方法；
public class Table {
    //表名称
    private String name;
    //处理后的表名称
    private String name2;
    //介绍
    private String comment;
    //主键列
    private String key;
    private List<Column> columnList;
}
