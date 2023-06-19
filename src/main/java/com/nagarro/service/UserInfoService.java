package com.nagarro.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.userInfoDao.User;
import com.nagarro.userInfoDao.UserInfoBackendDao;

@Service
public class UserInfoService {

	private final UserInfoBackendDao userBackendDao;
	
	@Autowired
	public UserInfoService(final UserInfoBackendDao userDao) {
		this.userBackendDao = userDao;
	}
	
	public Optional<User> getUserInfo(int userId) {
		
		User userInfo = userBackendDao.findByUserId(userId);
		System.out.println("userinfo--------------");
		System.out.println(userInfo.getUserName());
		return Optional.of(userInfo);
	}
	
	public void addUsers() {
		User user1 = new User(1, "Shweta");
		User user2 = new User(2, "Pankaj");
		User useroj = userBackendDao.save(user1);
		System.out.println("aaveduser"+useroj);
		userBackendDao.save(user2);
	}
}
