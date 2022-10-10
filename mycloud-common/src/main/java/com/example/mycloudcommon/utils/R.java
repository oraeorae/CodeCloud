package com.example.mycloudcommon.utils;


import java.util.HashMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 * @author Orall
 */
public class R extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * @param key 获取指定key的名字
     */
    public <T> T getData(String key, TypeReference<T> typeReference){
        Object data = get(key);
        return JSON.parseObject(JSON.toJSONString(data), typeReference);
    }
    /**
     * 复杂类型转换 TypeReference
     */
    public <T> T getData(TypeReference<T> typeReference){
        Object data = get("data");
        String s = JSON.toJSONString(data);
        return JSON.parseObject(s, typeReference);
    }
    public R setData(Object data){
        // 放入Object
        put("data", data);
        return this;
    }

    public R() {
        put("code", 0);
        put("msg", "success");
    }

    public static R error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常");
    }

    public static R error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public Integer getCode() {
        return (Integer) this.get("code");
    }
}
