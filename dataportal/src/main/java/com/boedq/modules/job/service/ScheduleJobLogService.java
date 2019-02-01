

package com.boedq.modules.job.service;

import com.baomidou.mybatisplus.service.IService;
import com.boedq.common.utils.PageUtils;
import com.boedq.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;


public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
