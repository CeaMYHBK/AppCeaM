package com.ceam.service.developer;

import com.ceam.dao.devuser.DevUserMapper;
import com.ceam.pojo.DevUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DevUserServiceImpl implements DevUserService {
	@Resource
	private DevUserMapper mapper;
	@Override
	public DevUser login(String devCode, String devPassword) throws Exception {
		// TODO Auto-generated method stub
		DevUser user = null;
		user = mapper.getLoginUser(devCode);
		//匹配密码
		if(null != user){
			if(!user.getDevPassword().equals(devPassword))
				user = null;
		}
		return user;
	}

}
