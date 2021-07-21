package com.example.test.modules.dao;

import com.example.test.modules.entity.TestV2;

public interface TestV2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestV2 record);

    int insertSelective(TestV2 record);

    TestV2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestV2 record);

    int updateByPrimaryKey(TestV2 record);
}