package com.dcloud.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dcloud.dao.UserDAO;
import com.dcloud.model.User;

public class UserDBService {

	//
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private UserDAO userDao;
	
	
	public UserDAO getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}


	public User getUser(int id) {
		logger.info("---- get user with id {}",id);
		return userDao.findById(id);
	}
}
