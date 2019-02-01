

package com.boedq.modules.app.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boedq.modules.app.entity.UserEntity;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
