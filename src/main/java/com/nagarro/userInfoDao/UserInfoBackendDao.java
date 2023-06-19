package com.nagarro.userInfoDao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoBackendDao extends JpaRepository<User, Integer> {
	
	public User findByUserId(int userId);
	public User findByUserName(String userName);
}
