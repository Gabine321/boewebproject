package com.boedq.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.boedq.common.utils.R;
import com.boedq.modules.sys.entity.SysUserTokenEntity;

public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
