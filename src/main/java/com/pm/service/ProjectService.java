package com.pm.service;

import java.util.List;

import com.pm.exception.PMException;
import com.pm.to.ProjectTO;

public interface ProjectService {
	
	public List<ProjectTO> getAllProjects() throws PMException;

	public String saveProject(ProjectTO project) throws PMException;

	public String suspendProject(int projectId) throws PMException;
}
