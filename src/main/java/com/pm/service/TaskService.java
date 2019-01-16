package com.pm.service;

import java.util.List;

import com.pm.exception.PMException;
import com.pm.to.TaskTO;

public interface TaskService {
	
	public String saveTask(TaskTO task) throws PMException;

	public List<TaskTO> getParentTasks() throws PMException;

	public List<TaskTO> getAllTasks(int projectId) throws PMException;

	public String endTask(int taskId) throws PMException;;
	
}
