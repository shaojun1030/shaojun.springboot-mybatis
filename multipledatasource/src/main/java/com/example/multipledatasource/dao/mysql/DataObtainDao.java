package com.example.multipledatasource.dao.mysql;


import java.util.List;
import java.util.Map;

import com.example.multipledatasource.domain.DataObtainDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据提取记录
 * @author zhanggj
 * @date 2017-11-17 10:20:47
 */
@Mapper
public interface DataObtainDao {

	DataObtainDO get(Long id);
	
	List<DataObtainDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DataObtainDO dataObtain);
	
	int update(DataObtainDO dataObtain);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
