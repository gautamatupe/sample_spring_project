package com.lonar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lonar.model.User;
import com.lonar.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping(value="/user")
	public List<User> getUser() {
		return userService.getUserList();
	}
}
