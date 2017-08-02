package com.moshang.core.service;



import com.moshang.core.entity.SysUserEntity;
import com.moshang.core.entity.SysUserTokenEntity;

import java.util.Set;

/**
 * shiro相关接口
 * @author moshang
 * @date 2017年08月02日
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}
