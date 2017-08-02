package com.moshang.modules.api.service;



import com.moshang.modules.api.entity.TokenEntity;

import java.util.Map;

/**
 * 用户Token
 *
 * @author moshang
 * @date 2017年08月02日
 */
public interface TokenService {

	TokenEntity queryByUserId(Long userId);

	TokenEntity queryByToken(String token);
	
	void save(TokenEntity token);
	
	void update(TokenEntity token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 * @return        返回token相关信息
	 */
	Map<String, Object> createToken(long userId);

}
