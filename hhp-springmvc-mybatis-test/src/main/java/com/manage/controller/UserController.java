package com.manage.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manage.dao.BaseSqlMapper;
import com.manage.model.UserInfo;
import com.manage.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private BaseSqlMapper baseSqlMapper;

	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable String userId) {
		UserInfo param = new UserInfo();
		param.setId(userId);
		UserInfo userInfo = userService.getUserById(param);
		modelMap.addAttribute("userInfo", userInfo);
		return "/user/showInfo";
	}

	@RequestMapping("/showInfos")
	public @ResponseBody Object showUserInfos() {
		List<UserInfo> userInfos = userService.getUsers();
		return userInfos;
	}
	
	@RequestMapping("/baseSqlInvoke")
	public @ResponseBody Object baseSqlInvoke() {
		List<HashMap<String, Object>> superSelect = baseSqlMapper.superSelect("update behavior set name= '${7} > ''114''' where code = '1'");
		System.out.println(superSelect.size());
		return superSelect.size();
	}

}
