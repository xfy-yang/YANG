package com.example.test.modules.dao;

import com.example.test.modules.entity.TestModel;

import java.util.List;

public interface TestMapperV2 {
    List<TestModel> select();

    int insert(TestModel testModel);
}
