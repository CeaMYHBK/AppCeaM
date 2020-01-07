package com.ceam.service.developer;

import com.ceam.dao.datadictionary.DataDictionaryMapper;
import com.ceam.pojo.DataDictionary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {
	
	@Resource
	private DataDictionaryMapper mapper;
	
	@Override
	public List<DataDictionary> getDataDictionaryList(String typeCode)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDataDictionaryList(typeCode);
	}

}
