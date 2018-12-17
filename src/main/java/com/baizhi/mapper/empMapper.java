package com.baizhi.mapper;

import com.baizhi.entity.emp;

public interface empMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(emp record);

    int insertSelective(emp record);

    emp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(emp record);

    int updateByPrimaryKey(emp record);
}