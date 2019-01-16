package com.pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pm.dao.TaskDao;
import com.pm.exception.PMException;
import com.pm.to.TaskTO;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDao taskDao;

	public String saveTask(TaskTO task) throws PMException {
		if(task.isParent()) {			
			return taskDao.saveParentTask(task);
		}else {
			return taskDao.saveTask(task);
		}
	}

	public List<TaskTO> getParentTasks() throws PMException {
		return taskDao.getParentTasks();
	}

	public List<TaskTO> getAllTasks(int projectId) throws PMException {
		return taskDao.getAllTasks(projectId);
	}

	public String endTask(int taskId) throws PMException {		
		return taskDao.endTask(taskId);
	}	

}
