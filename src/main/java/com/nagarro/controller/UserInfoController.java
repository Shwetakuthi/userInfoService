package com.nagarro.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.service.UserInfoService;
import com.nagarro.userInfoDao.User;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserInfoController {
	
	
	private final UserInfoService userService;
	
	@Autowired
	public UserInfoController(final UserInfoService userInfoService) {
		this.userService = userInfoService;
	}
	
	
	@GetMapping(value = "{userId}")
	public Optional<User> getUserForId(@PathVariable String userId) {
		
		return userService.getUserInfo(Integer.valueOf(userId));
		
	}
	
	@PostMapping()
	public void insertNewUsers() {
		userService.addUsers();
	}

}
