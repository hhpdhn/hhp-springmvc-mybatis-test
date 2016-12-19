package andy.service;

import java.util.List;

import andy.model.UserInfo;

public interface UserService {
	UserInfo getUserById(int id);

	List<UserInfo> getUsers();

	int insert(UserInfo userInfo);
	
	String invokeUserService();
}
