package com.ceam.dao.backenduser;

import com.ceam.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

public interface BackendUserMapper {

	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public BackendUser getLoginUser(@Param("userCode") String userCode)throws Exception;

}
