package com.moshang.core.service;


import com.moshang.core.entity.SysUserTokenEntity;
import com.moshang.utils.R;

/**
 * 用户Token
 *
 * @author moshang
 * @date 2017年08月02日
 */
public interface SysUserTokenService {

	SysUserTokenEntity queryByUserId(Long userId);

	void save(SysUserTokenEntity token);
	
	void update(SysUserTokenEntity token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
