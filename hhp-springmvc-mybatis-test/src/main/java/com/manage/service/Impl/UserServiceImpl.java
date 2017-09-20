package com.manage.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.UserInfoMapper;
import com.manage.model.UserInfo;
import com.manage.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo getUserById(UserInfo user) {
		return userInfoMapper.selectUser(user);
	}

	@Override
	public List<UserInfo> getUsers() {
		return userInfoMapper.selectUsers();
	}

	@Override
	public int insert(UserInfo userInfo) {

		int result = userInfoMapper.insert(userInfo);
//		int count = 9/0;
		System.out.println(result);
		return result;
	}

	@Override
	public String invokeUserService() {
		System.out.println("invokeUserService");
		return "invokeUserService UserServiceImpl";
	}

	@Override
	public int updateTestAffair(UserInfo userInfo) {
		int result = userInfoMapper.insert(userInfo);
		System.out.println(result);
		int deleteUser = userInfoMapper.deleteUser(userInfo.getId());
		System.out.println(deleteUser);
		return deleteUser;
	}

}
