package com.manage.dao;

import org.springframework.stereotype.Repository;

import com.manage.model.Organization;
@Repository
public interface OrganizationMapper {
    int deleteByPrimaryKey(String code);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
}