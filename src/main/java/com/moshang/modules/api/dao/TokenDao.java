package com.moshang.modules.api.dao;


import com.moshang.core.dao.BaseDao;
import com.moshang.modules.api.entity.TokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Token
 *
 * @author moshang
 * @date 2017年08月02日
 */
@Mapper
public interface TokenDao extends BaseDao<TokenEntity> {
    
    TokenEntity queryByUserId(Long userId);

    TokenEntity queryByToken(String token);
	
}
