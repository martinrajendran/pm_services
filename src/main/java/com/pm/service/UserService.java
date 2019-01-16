package com.pm.service;

import java.util.List;

import com.pm.exception.PMException;
import com.pm.to.UserTO;

public interface UserService {
	
	public List<UserTO> getAllUsers() throws PMException;

	public String saveUser(UserTO user) throws PMException;

	public String deleteUser(int userId) throws PMException;
}
