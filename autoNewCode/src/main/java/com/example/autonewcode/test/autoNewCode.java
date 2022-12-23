package com.example.autonewcode.test;

import com.example.autonewcode.pojo.DataBase;
import com.example.autonewcode.pojo.Settings;
import com.example.autonewcode.utils.FileUtils;
import com.example.autonewcode.utils.*;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.File;

public class autoNewCode {
    /**
     * @description 自动生成Spring增删查改代码
     * @throws Exception
     * @date 2022.9.15更新
     */
    @Test
    public void autoNewCode() throws Exception {
        //配置项目（项目包名，项目名）
        String packagename = "com.example.mycloudmember";
        String projectEngName = "qaq";
        //配置数据库（数据库IP,数据库端口，数据库名，数据库用户名，数据库密码，数据库类型）
        String ip = "8.134.120.93";
        String port = "3306";
        String db = "code-generator";
        String username = "root";
        String password = "root";
        String dbKind = "MYSQL";
        //生成代码的位置（生成在当前路径的target上）
        String fileUrl = System.getProperty("user.dir")+new File("\\target");
        Settings settings = new Settings();
        //包名(com.ftx.demo)
        settings.setPPackage(packagename);
        //split(".")无法分割字符串，必须加上\\
        String[] split = packagename.split("\\.");
        //com
        settings.setPath1(split[0]);
        //ftx
        settings.setPath2(split[1]);
        //demo
        settings.setPath3(split[2]);
        //项目名（没啥用）
        settings.setProject(projectEngName);
        //设置作者
        settings.setAuthor("Orall");
        settings.setSuccessFunction("R.ok");
        settings.setFailFunction("R.error");
        settings.setReturnValue("R");
        //设置主键类型
        settings.setKeyType("Long");
        //默认只支持mysql数据库吧，oracle暂时先不处理，先写死为mysql
        DataBase dbs = new DataBase("MYSQL", ip, port,db);
        dbs.setUserName(username);
        dbs.setPassWord(password);
        GeneratorFacade generatorFacade = new GeneratorFacade(dbKind, fileUrl, settings, dbs);
        System.out.println(generatorFacade.toString());
        boolean b = generatorFacade.generatorByDataBase(db);
        if( b ){
            FileUtils.searchFilesAndRename(new File(fileUrl+"\\"+settings.getPath1()));
            System.out.println("代码已生成，请在 " + fileUrl + " 中查看");
        }else{
            System.out.println("代码生成失败");
        }
    }
}
