package andy.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import andy.dao.UserInfoMapper;
import andy.model.UserInfo;
import andy.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo getUserById(int id) {
		return userInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<UserInfo> getUsers() {
		return userInfoMapper.selectAll();
	}

	@Override
	public int insert(UserInfo userInfo) {

		int result = userInfoMapper.insert(userInfo);

		System.out.println(result);
		return result;
	}

	@Override
	public String invokeUserService() {
		System.out.println("invokeUserService");
		return "invokeUserService UserServiceImpl";
	}

}
