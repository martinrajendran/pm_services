package com.pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pm.dao.UserDao;
import com.pm.exception.PMException;
import com.pm.to.UserTO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;	
	
	public List<UserTO> getAllUsers() throws PMException {
			return userDao.getAllUsers();		
	}
	
	public String saveUser(UserTO user) throws PMException {
			return userDao.saveUser(user);		
	}

	public String deleteUser(int userId) throws PMException {
		return userDao.deleteUser(userId);	
	}

}
