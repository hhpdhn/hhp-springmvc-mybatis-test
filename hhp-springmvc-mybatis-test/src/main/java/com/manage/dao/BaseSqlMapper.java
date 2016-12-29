package com.manage.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface BaseSqlMapper {
    List<HashMap<String,Object>> superSelect(String sql);
}