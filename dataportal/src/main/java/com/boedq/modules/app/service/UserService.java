package com.boedq.modules.app.service;


import com.baomidou.mybatisplus.service.IService;
import com.boedq.modules.app.entity.UserEntity;
import com.boedq.modules.app.form.LoginForm;

public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回用户ID
	 */
	long login(LoginForm form);
}
