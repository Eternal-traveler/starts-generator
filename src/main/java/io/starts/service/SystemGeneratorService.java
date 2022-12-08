package io.starts.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.starts.dao.GeneratorDao;
import io.starts.utils.PageUtils;
import io.starts.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author haoyang
 * @create 2022-12-08 20:25
 * @Description 系统生成service
 */
@Service
public class SystemGeneratorService {

    private final GeneratorDao generatorDao;

    public SystemGeneratorService(GeneratorDao generatorDao) {
        this.generatorDao = generatorDao;
    }

    public PageUtils queryList(Query query) {
        Page<?> page = PageHelper.startPage(query.getPage(), query.getLimit());
        List<Map<String, Object>> list = generatorDao.queryList(query);
        int total = (int) page.getTotal();
//        if (generatorDao instanceof MongoDBGeneratorDao) {
//            total = MongoDBCollectionFactory.getCollectionTotal(query);
//        }
//        return new PageUtils(list, total, query.getLimit(), query.getPage());
        return new PageUtils(total, query.getLimit(), query.getPage(), query.getPage(), list);
    }

    public Map<String, String> queryTable(String tableName) {
        return generatorDao.queryTable(tableName);
    }

    public List<Map<String, String>> queryColumns(String tableName) {
        return generatorDao.queryColumns(tableName);
    }
}
