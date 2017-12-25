package com.iber.auth.repository;


import com.iber.auth.domain.SysUser;

import java.util.List;
import java.util.Map;

/**
 * @author zengfeiyue
 */
public interface SysUserMapper {

	List<SysUser> getByMap(Map<String, Object> map);
	SysUser getById(Integer id);
	Integer create(SysUser sysUser);
	int update(SysUser sysUser);
	SysUser getByUserName(String userName);
}