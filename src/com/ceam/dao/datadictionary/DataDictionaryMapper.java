package com.ceam.dao.datadictionary;

import com.ceam.pojo.DataDictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataDictionaryMapper {
	
	public List<DataDictionary> getDataDictionaryList(@Param("typeCode") String typeCode)throws Exception;
}
