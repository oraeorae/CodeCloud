package com.example.autonewcode.utils;


import com.example.autonewcode.pojo.DataBase;
import com.example.autonewcode.pojo.Settings;
import com.example.autonewcode.pojo.Table;

import java.util.List;
import java.util.Map;

/**
 * 准备数据模型，调用核心处理类Generator类完成代码生成工作
 */
public class GeneratorFacade {
    //模板位置
    private String templatePath;
    //代码生成路径
    private String outPath;
    //工程配置对象
    private Settings settings;
    //数据库对象
    private DataBase db;
    private Generator generator;

    public GeneratorFacade(String templatePath, String outPath, Settings settings, DataBase db) throws Exception {
        this.templatePath = templatePath;
        this.outPath = outPath;
        this.settings = settings;
        this.db = db;
        generator = new Generator(templatePath, outPath);
    }

    /**
     * 准备数据模型
     * 调用核心处理类完成代码生成工作
     */
    public boolean generatorByDataBase(String dbss) throws Exception {
        List<Table> tables = DataBaseUtils.getDbInfo(db, dbss);
        for (Table table : tables) {
            //对每个table进行代码生成
            Map<String, Object> dataModel = getDataModel(table);
            /**
             * 得到的数据模型如下
             * {NUMBER=Long, CHAR=String, project=test, BIGINT=Long, TEXT=String, className=r, VARCHAR2=String,
             * INT=Integer, NVARCHAR2=String, DATE=java.util.Date, DATETIME=java.util.Date, path1=com, path2=ftx,
             * path3=demo, pPackage=com.ftx.demo, VARCHAR=String, testKey=testValue, DOUBLE=Double, tableRemovePrefixes="tb_,co_",
             * table=Table{name='user', name2='r', comment='null', key='userid,userno,id,Host,User,id,',
             * columnList=[Column{columnName='id', columnName2='id', columnType='Integer', columnDbType='INT', columnComment='null',
             * columnKey='null'}, Column{columnName='account', columnName2='account', columnType='String', columnDbType='VARCHAR',
             * columnComment='null', columnKey='null'}, Column{columnName='password', columnName2='password', columnType='String',
             * columnDbType='VARCHAR', columnComment='null', columnKey='null'}, Column{columnName='islogin', columnName2='islogin',
             * columnType='Integer', columnDbType='INT', columnComment='null', columnKey='null'}]}}
             */
            //调用代码生成方法，把数据模型传过去，进行生成
            generator.scanAndGenerator(dataModel);
        }
        return true;
    }

    /**
     * 根据table对象获取数据模型
     *
     * @param table
     * @return
     */
    private Map<String, Object> getDataModel(Table table) {
        //Map<String, Object> map = new HashMap<>();
        Map<String, Object> map = ConvertUtils.setConditionMap(settings);
        //自定义配置
        map.putAll(PropertiesUtils.customMap);
        //元数据
        map.put("table", table);
        //settings
        map.put("project", this.settings.getProject());
        map.put("pPackage", this.settings.getPPackage());
        map.put("path1", this.settings.getPath1());
        map.put("path2", this.settings.getPath2());
        map.put("path3", this.settings.getPath3());
        //类名
        map.put("className", table.getName2());
        return map;
    }
}