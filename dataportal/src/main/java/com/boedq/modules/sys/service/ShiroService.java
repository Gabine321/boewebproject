package com.boedq.modules.sys.service;

import java.util.Set;

import com.boedq.modules.sys.entity.SysUserEntity;
import com.boedq.modules.sys.entity.SysUserTokenEntity;

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
