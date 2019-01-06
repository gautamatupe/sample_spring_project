package com.lonar.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lonar.dao.UserDao;
import com.lonar.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<User> getUserList() {
		List<User> customers = new ArrayList<User>();
		String SQL = "select * from user";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);
		for (Map<String, Object> row : rows) {
			User customer = new User();
			
			customer.setId((int)row.get("id"));
			customer.setName((String)row.get("name"));
			customer.setEmail((String)row.get("email"));
			
			customers.add(customer);
		}

		return customers;
	}

}
