package com.example.autonewcode.utils;

import com.example.autonewcode.pojo.Column;
import com.example.autonewcode.pojo.DataBase;
import com.example.autonewcode.pojo.Table;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 方法介绍：
 * 1，获取数据库连接
 * 2，获取数据库列表
 * 3，获取数据库中的所有表和字段并构造实体类
 * 4，根据表名的截取操作生成类名
 */
public class DataBaseUtils {
    /**
     * 获取数据库连接
     * @param db
     * @return
     * @throws Exception
     */
    public static Connection getConnection(DataBase db) throws Exception {
        //获取连接
        //注册驱动
        Class.forName(db.getDriver());
        Connection connection = DriverManager.getConnection(db.getUrl(), db.getUserName(), db.getPassWord());
        return connection;
    }

    /**
     * 获取数据库列表
     * @param db
     * @return
     * @throws Exception
     */
    public static List<String> getShemas(DataBase db) throws Exception {
        Connection connection = getConnection(db);
        //获取元数据
        DatabaseMetaData metaData = connection.getMetaData();
        //获取所有数据库列表
        ResultSet resultSet = metaData.getCatalogs();
        List<String> list = new ArrayList<>();
        while (resultSet.next()) {
            list.add(resultSet.getString(1));
        }
        resultSet.close();
        connection.close();
        return list;
    }

    /**
     * 获取数据库中的所有表和字段并构造实体类（相当于一键生成数据库中所有表的增删改查代码）
     * @param db
     * @param dbss
     * @return
     * @throws Exception
     */
    public static List<Table> getDbInfo(DataBase db, String dbss) throws Exception {
        //获取连接
        Connection connection = getConnection(db);
        //获取元数据
        DatabaseMetaData metaData = connection.getMetaData();
        List<Table> list = new ArrayList<>();
        //获取当前数据库的所有表
        //String dbss = (String) session.getAttribute("db");
        ResultSet tables = metaData.getTables(dbss, null, null, new String[]{"TABLE"});
        while (tables.next()) {
            //表名
            String table_name = tables.getString("TABLE_NAME");
            //构造生成对应实体类的类名
            String className = removePrefix(table_name);
            //主键
            ResultSet primaryKeys = metaData.getPrimaryKeys(null, null, table_name);
            //对主键遍历的原因（或许一张表有多个主键）
            String keys = "";
            if (primaryKeys.next()) {
                String keyName = primaryKeys.getString("COLUMN_NAME");
                keys += keyName;
            }
            Table tab = new Table();
            tab.setName(table_name);
            tab.setName2(className);
            tab.setKey(keys);
            //处理表中的所有字段
            ResultSet columns = metaData.getColumns(dbss, null, table_name, null);
            List<Column> cols = new ArrayList<>();
            while (columns.next()) {
                Column column = new Column();
                //列名称
                String column_name = columns.getString("COLUMN_NAME");
                //java实体的属性名
                String attName = column_name;
                //java类型和数据库类型
                String type_name = columns.getString("TYPE_NAME");
                String javaType = PropertiesUtils.customMap.get(type_name);
                column.setColumnName(column_name);
                column.setColumnName2(attName);
                column.setColumnDbType(type_name);
                column.setColumnType(javaType);
                cols.add(column);
            }
            tab.setColumnList(cols);
            list.add(tab);
            //关闭连接，释放资源
            columns.close();
            primaryKeys.close();
        }
        tables.close();
        connection.close();
        return list;
    }

    /**
     * 根据表名的截取操作生成类名
     * @param tableName
     * @return
     */
    public static String removePrefix(String tableName) {
        //从自定义的配置文件中拿到前缀的配置
        String prefixes = PropertiesUtils.customMap.get("tableRemovePrefixes");
        //这里就不字符串处理了，直接把表名当类名用了
        String replace = tableName;
        return replace;
    }
}
