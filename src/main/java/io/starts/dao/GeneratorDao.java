package io.starts.dao;

import java.util.List;
import java.util.Map;

/**
 * @author haoyang
 * @create 2022-12-08 20:25
 * @Description
 */
public interface GeneratorDao {
    /**
     * 获取数据库
     * @param map map
     * @return 返回数据库集合
     */
    List<Map<String, Object>> queryList(Map<String, Object> map);

    /**
     * 获取数据库表
     * @param tableName 数据库表名称
     * @return 返回数据库
     */
    Map<String, String> queryTable(String tableName);

    /**
     * 获取数据库列
     * @param tableName 数据库表名称
     * @return 数据库列表集合
     */
    List<Map<String, String>> queryColumns(String tableName);
}
