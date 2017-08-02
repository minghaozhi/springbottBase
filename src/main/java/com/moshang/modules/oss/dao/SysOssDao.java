package com.moshang.modules.oss.dao;


import com.moshang.core.dao.BaseDao;
import com.moshang.modules.oss.entity.SysOssEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 *
 * @author moshang
 * @date 2017年08月06日
 */
@Mapper
public interface SysOssDao extends BaseDao<SysOssEntity> {
	
}
