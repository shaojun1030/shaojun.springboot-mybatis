package com.example.multipledatasource.service;


import com.example.multipledatasource.dao.mysql.DataObtainDao;
import com.example.multipledatasource.domain.DataObtainDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DataObtainService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private DataObtainDao dataObtainDao;


    public DataObtainDO get(Long id) {
        return dataObtainDao.get(id);
    }


    public List<DataObtainDO> list(Map<String, Object> map) {
        return dataObtainDao.list(map);
    }


    public int count(Map<String, Object> map) {
        return dataObtainDao.count(map);
    }


    public int save(DataObtainDO dataObtain) {
        return dataObtainDao.save(dataObtain);
    }


    public int update(DataObtainDO dataObtain) {
        return dataObtainDao.update(dataObtain);
    }


    public int remove(Long id) {
        return dataObtainDao.remove(id);
    }


    public int batchRemove(Long[] ids) {
        return dataObtainDao.batchRemove(ids);
    }

}
