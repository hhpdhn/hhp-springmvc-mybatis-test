package com.manage.service;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.manage.model.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml", "classpath:spring.xml" })
public class TestUserService {
	private static final Logger LOGGER = Logger.getLogger(TestUserService.class);

	@Autowired
	private UserService userService;

	@Test
	public void testQueryById1() {
		UserInfo user = new UserInfo();
		UserInfo userInfo = userService.getUserById(user);
		LOGGER.info(JSON.toJSON(userInfo));
	}

	@Test
	public void testQueryAll() {
		List<UserInfo> userInfos = userService.getUsers();
		System.out.println("size:"+userInfos.size());
		for (Iterator<UserInfo> iterator = userInfos.iterator(); iterator.hasNext();) {
			UserInfo userInfo = (UserInfo) iterator.next();
			System.out.println(userInfo.getName());
		}
		LOGGER.debug(userInfos.size());
		LOGGER.info(JSON.toJSON(userInfos));
	}

	@Test
	public void testInsert() {
		UserInfo userInfo = new UserInfo();
		userInfo.setId("2");
		userInfo.setName("xiaoming");
		userInfo.setPhone("13548051653");
		int result = userService.insert(userInfo);
		System.out.println(result);
	}

	@Test
	public void testLogInfo() {
		System.out.println("1245567");
		LOGGER.info("info");
		LOGGER.debug("debug");
	}
}
