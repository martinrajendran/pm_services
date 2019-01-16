package com.pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pm.dao.ProjectDao;
import com.pm.exception.PMException;
import com.pm.to.ProjectTO;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDao projectDao;	

	public List<ProjectTO> getAllProjects() throws PMException {
		return projectDao.getAllProjects();
	}

	public String saveProject(ProjectTO project) throws PMException {
		return projectDao.saveProject(project);
	}

	public String suspendProject(int projectId) throws PMException {
		return projectDao.suspendProject(projectId);
	}

}
