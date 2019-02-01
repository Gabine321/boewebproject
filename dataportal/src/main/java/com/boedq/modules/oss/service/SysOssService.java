

package com.boedq.modules.oss.service;

import com.baomidou.mybatisplus.service.IService;
import com.boedq.common.utils.PageUtils;
import com.boedq.modules.oss.entity.SysOssEntity;

import java.util.Map;

public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
