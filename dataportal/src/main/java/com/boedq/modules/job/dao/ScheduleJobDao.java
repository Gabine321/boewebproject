

package com.boedq.modules.job.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.boedq.modules.job.entity.ScheduleJobEntity;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;


@Mapper
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {
	
	
	int updateBatch(Map<String, Object> map);
}
