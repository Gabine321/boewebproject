

package com.boedq.modules.job.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;


@TableName("schedule_job")
public class ScheduleJobEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
    public static final String JOB_PARAM_KEY = "JOB_PARAM_KEY";
	
	
	@TableId
	private Long jobId;

	
	@NotBlank(message="bean名称不能为空")
	private String beanName;
	
	
	@NotBlank(message="方法名称不能为空")
	private String methodName;
	
	
	private String params;
	
	
	@NotBlank(message="cron表达式不能为空")
	private String cronExpression;

	
	private Integer status;

	
	private String remark;

	
	private Date createTime;

	
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	
	public Long getJobId() {
		return jobId;
	}
	
	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
	public void setStatus(Integer status) {
		this.status = status;
	}

	
	public Integer getStatus() {
		return status;
	}
	
	
	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	
	public String getCronExpression() {
		return cronExpression;
	}
	
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	
	public Date getCreateTime() {
		return createTime;
	}
}
