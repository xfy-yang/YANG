package com.example.test.modules.service;

import com.example.test.modules.dao.TestMapperV2;
import com.example.test.modules.entity.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySQLTestServiceV2 {
    @Autowired
    private TestMapperV2 testMapperV2;  //这里会有报错，不用管

    public List<TestModel> select() {
        return testMapperV2.select();
    }

    public int insert(int id, String name) {
        TestModel testModel = new TestModel();
        testModel.setId(id);
        testModel.setName(name);

        return testMapperV2.insert(testModel);
    }
}
