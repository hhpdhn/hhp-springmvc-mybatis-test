package com.manage.service;

import java.util.List;

import com.manage.model.UserInfo;

public interface UserService {
	UserInfo getUserById(UserInfo user);

	List<UserInfo> getUsers();

	int insert(UserInfo userInfo);
	
	String invokeUserService();
	
	int updateTestAffair(UserInfo userInfo);
}
