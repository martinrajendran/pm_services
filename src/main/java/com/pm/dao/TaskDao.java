package com.pm.dao;

import java.util.List;

import com.pm.exception.PMException;
import com.pm.to.TaskTO;

public interface TaskDao {

	public String saveTask(TaskTO task) throws PMException;
	
	public String saveParentTask(TaskTO task) throws PMException;

	public List<TaskTO> getParentTasks() throws PMException;

	public List<TaskTO> getAllTasks(int projectId)throws PMException;

	public String endTask(int taskId) throws PMException;

}
