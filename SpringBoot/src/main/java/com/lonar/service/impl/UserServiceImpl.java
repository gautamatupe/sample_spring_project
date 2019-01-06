package com.lonar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lonar.dao.UserDao;
import com.lonar.model.User;
import com.lonar.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public List<User> getUserList() {
		 
		return userDao.getUserList();
	}

}
