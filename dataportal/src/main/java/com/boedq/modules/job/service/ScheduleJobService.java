

package com.boedq.modules.job.service;

import com.baomidou.mybatisplus.service.IService;
import com.boedq.common.utils.PageUtils;
import com.boedq.modules.job.entity.ScheduleJobEntity;

import java.util.Map;


public interface ScheduleJobService extends IService<ScheduleJobEntity> {

	PageUtils queryPage(Map<String, Object> params);

	
	void save(ScheduleJobEntity scheduleJob);
	
	
	void update(ScheduleJobEntity scheduleJob);
	
	
	void deleteBatch(Long[] jobIds);
	
	
	int updateBatch(Long[] jobIds, int status);
	
	
	void run(Long[] jobIds);
	
	
	void pause(Long[] jobIds);
	
	
	void resume(Long[] jobIds);
}
