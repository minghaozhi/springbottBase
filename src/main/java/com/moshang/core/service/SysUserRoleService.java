package com.moshang.core.service;

import java.util.List;



/**
 * 用户与角色对应关系
 *
 * @author moshang
 * @date 2017年08月02日
 */
public interface SysUserRoleService {
	
	void saveOrUpdate(Long userId, List<Long> roleIdList);
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
	
	void delete(Long userId);
}
