package com.manage.dao;

import org.springframework.stereotype.Repository;

import com.manage.model.Behavior;
@Repository
public interface BehaviorMapper {
    int deleteByPrimaryKey(String code);

    int insert(Behavior record);

    int insertSelective(Behavior record);

    Behavior selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Behavior record);

    int updateByPrimaryKey(Behavior record);
}