package com.ceam.service.backend;
import com.ceam.pojo.BackendUser;

public interface BackendUserService {
	/**
	 * 用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	public BackendUser login(String userCode, String userPassword) throws Exception;
}
