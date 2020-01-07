package com.ceam.service.backend;

import com.ceam.dao.backenduser.BackendUserMapper;
import com.ceam.pojo.BackendUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BackendUserServiceImpl implements BackendUserService {
	@Resource
	private BackendUserMapper mapper;
	
	@Override
	public BackendUser login(String userCode, String userPassword) throws Exception {
		// TODO Auto-generated method stub
		BackendUser user = null;
		user = mapper.getLoginUser(userCode);
		//匹配密码
		if(null != user){
			if(!user.getUserPassword().equals(userPassword))
				user = null;
		}
		return user;
	}

}
