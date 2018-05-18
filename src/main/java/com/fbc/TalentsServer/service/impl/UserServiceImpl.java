package com.fbc.TalentsServer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fbc.TalentsServer.dao.UserDao;
import com.fbc.TalentsServer.domain.User;
import com.fbc.TalentsServer.service.UserService;
@Component
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao dao;

	@Override
	public User findUserByPhone(Integer id) {
		return dao.findUserByPhone(id);
	}

	@Override
	public int insert(String name, String password, String phone) {
		return dao.insert(name, password, phone);
	}
}
