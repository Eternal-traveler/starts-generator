package io.starts.utils;

import java.util.HashMap;

/**
 * @author haoyang
 * @create 2022-12-08 20:45
 * @Description 返回数据
 */
public class ReturnData extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public static ReturnData ok() {
        return new ReturnData();
    }

    @Override
    public ReturnData put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
