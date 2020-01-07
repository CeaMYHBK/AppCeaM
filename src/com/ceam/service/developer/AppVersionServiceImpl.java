package com.ceam.service.developer;

import com.ceam.dao.appinfo.AppInfoMapper;
import com.ceam.dao.appversion.AppVersionMapper;
import com.ceam.pojo.AppVersion;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppVersionServiceImpl implements AppVersionService {
	
	@Resource
	private  AppVersionMapper mapper;
	@Resource
	private AppInfoMapper appInfoMapper;
	
	@Override
	public List<AppVersion> getAppVersionList(Integer appId) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppVersionList(appId);
	}
	/**
	 * 业务：新增app的版本信息
	 * 1、app_verion表插入数据
	 * 2、更新app_info表对应app的versionId字段（记录最新版本id）
	 * 注意：事务控制
	 */
	@Override
	public boolean appsysadd(AppVersion appVersion) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		Integer versionId = null;
		if(mapper.add(appVersion) > 0){
			versionId = appVersion.getId();
			flag = true;
		}
		if(appInfoMapper.updateVersionId(versionId, appVersion.getAppId()) > 0 && flag){
			flag = true;
		}
		return flag;
	}
	@Override
	public AppVersion getAppVersionById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppVersionById(id);
	}
	@Override
	public boolean modify(AppVersion appVersion) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(mapper.modify(appVersion) > 0){
			flag = true;
		}
		return flag;
	}
	@Override
	public boolean deleteApkFile(Integer id) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(mapper.deleteApkFile(id) > 0){
			flag = true;
		}
		return flag;
	}

}
