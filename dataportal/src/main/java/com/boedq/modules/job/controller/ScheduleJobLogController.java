

package com.boedq.modules.job.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.boedq.common.utils.PageUtils;
import com.boedq.common.utils.R;
import com.boedq.modules.job.entity.ScheduleJobLogEntity;
import com.boedq.modules.job.service.ScheduleJobLogService;

import java.util.Map;


@RestController
@RequestMapping("/sys/scheduleLog")
public class ScheduleJobLogController {
	@Autowired
	private ScheduleJobLogService scheduleJobLogService;
	
	
	@GetMapping("/list")
	@RequiresPermissions("sys:schedule:log")
	public R list(@RequestParam Map<String, Object> params){
		PageUtils page = scheduleJobLogService.queryPage(params);
		
		
		
		
		
		
		
		
		
		
		return R.ok().put("page", page);
	}
	
	
	@GetMapping("/info/{logId}")
	public R info(@PathVariable("logId") Long logId){
		ScheduleJobLogEntity log = scheduleJobLogService.selectById(logId);
		
		return R.ok().put("log", log);
	}
}
