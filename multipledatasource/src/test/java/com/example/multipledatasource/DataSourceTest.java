package com.example.multipledatasource;

import com.example.multipledatasource.dao.mysql.DataObtainDao;
import com.example.multipledatasource.dao.oracle.DictAreaMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataSourceTest extends MultipleDatasourceApplicationTests {

    @Autowired
    DataObtainDao dataObtainDao;
    @Autowired
    DictAreaMapper dictAreaMapper;

    @Test
    public void test() {
        Map<String, Object> params = new HashMap<>();
        List list1 = dataObtainDao.list(params);
        logger.info("查询结果:{}", list1.size());


        List list2 = dictAreaMapper.findAll();
        logger.info("查询结果:{}", list2.size());
    }
}
