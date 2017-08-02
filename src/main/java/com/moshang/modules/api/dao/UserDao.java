package com.moshang.modules.api.dao;


import com.moshang.core.dao.BaseDao;
import com.moshang.modules.api.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author moshang
 * @date 2017年08月02日
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
