package com.manage.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.manage.model.UserInfo;
@Repository
public interface UserInfoMapper {
    int insert(UserInfo record);

    int insertSelective(UserInfo record);
    
    int deleteUser(String record);

    public UserInfo selectUser(UserInfo user);

	List<UserInfo> selectUsers();
}