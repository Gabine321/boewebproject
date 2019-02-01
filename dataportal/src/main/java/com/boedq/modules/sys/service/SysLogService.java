
package com.boedq.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import com.boedq.common.utils.PageUtils;
import com.boedq.modules.sys.entity.SysLogEntity;

import java.util.Map;


public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
