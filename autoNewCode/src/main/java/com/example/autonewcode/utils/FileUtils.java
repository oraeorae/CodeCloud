package com.example.autonewcode.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件处理工具类
 * 1.查询整个目录的文件夹
 * 2.递归获取某个目录下的所有文件夹
 */

public class FileUtils {
    /**
     * 得到相对路径
     * @param baseDir
     * @param file
     * @return
     */
    public static String getRelativePath(File baseDir, File file) {
        if (baseDir.equals(file)) {
            return "";
        }
        if (baseDir.getParentFile() == null) {
            return file.getAbsolutePath().substring(baseDir.getAbsolutePath().length());
        } else {
            return file.getAbsolutePath().substring(baseDir.getAbsolutePath().length() + 1);
        }
    }

    /**
     * 查询整个目录下的所有文件
     * @param dir
     * @return
     * @throws IOException
     */
    public static List<File> searchAllFile(File dir) throws IOException {
        ArrayList arrayList = new ArrayList();
        searchFiles(dir, arrayList);
        return arrayList;
    }

    /**
     * 递归获取某个目录下的所有文件
     * @param dir
     * @param collector
     */
    public static void searchFiles(File dir, List<File> collector) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                searchFiles(files[i], collector);
            }
        } else {
            collector.add(dir);
        }
    }

    /**
     * 递归获取某个目录下的所有文件并重命名
     * @param dir
     */
    public static void searchFilesAndRename(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                searchFilesAndRename(files[i]);
            }
        } else {

            String src = dir.getPath();
            int index = 0;
            if( src.lastIndexOf('\\') != -1 ){
                index = src.lastIndexOf('\\');
            }else{
                index = src.lastIndexOf('/');
            }
            src = src.substring(0,index);
            String name = dir.getName();
            dir.renameTo(new File(src,upperTable(name)));
        }
    }

    /**
     * 将首字母和带 _ 后第一个字母 转换成大写
     * @param str
     * @return
     */
    public static String upperTable(String str)
    {
        // 字符串缓冲区
        StringBuffer sbf = new StringBuffer();
        // 如果字符串包含 下划线
        if (str.contains("_"))
        {
            // 按下划线来切割字符串为数组
            String[] split = str.split("_");
            // 循环数组操作其中的字符串
            for (int i = 0, index = split.length; i < index; i++)
            {
                // 递归调用本方法
                String upperTable = upperTable(split[i]);
                // 添加到字符串缓冲区
                sbf.append(upperTable);
            }
        } else
        {// 字符串不包含下划线
            // 转换成字符数组
            char[] ch = str.toCharArray();
            // 判断首字母是否是字母
            if (ch[0] >= 'a' && ch[0] <= 'z')
            {
                // 利用ASCII码实现大写
                ch[0] = (char) (ch[0] - 32);
            }
            // 添加进字符串缓存区
            sbf.append(ch);
        }
        // 返回
        return sbf.toString();
    }

    /**
     * 创建文件
     * @param dir
     * @param file
     * @return
     */
    public static File mkdir(String dir, String file) {
        if (dir == null) {
            throw new IllegalArgumentException("文件夹不许为空");
        }
        File result = new File(dir, file);
        if (result.getParentFile() != null) {
            result.getParentFile().mkdirs();
        }
        return result;
    }
}