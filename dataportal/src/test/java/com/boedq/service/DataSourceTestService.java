package com.boedq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boedq.datasources.DataSourceNames;
import com.boedq.datasources.annotation.DataSource;
import com.boedq.modules.sys.entity.SysUserEntity;
import com.boedq.modules.sys.service.SysUserService;

@Service
public class DataSourceTestService {
    @Autowired
    private SysUserService sysUserService;

    public SysUserEntity queryUser(Long userId){
        return sysUserService.selectById(userId);
    }

    @DataSource(name = DataSourceNames.SECOND)
    public SysUserEntity queryUser2(Long userId){
        return sysUserService.selectById(userId);
    }
}
