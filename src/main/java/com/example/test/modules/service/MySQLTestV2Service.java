package com.example.test.modules.service;

import com.example.test.modules.dao.TestV2Mapper;
import com.example.test.modules.entity.TestV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySQLTestV2Service {
    @Autowired
    private TestV2Mapper testV2Mapper;  //这里会有报错，不用管

    public int insert(int id, String username, String password) {
        TestV2 testV2 = new TestV2();
        testV2.setId(id);
        testV2.setUsername(username);
        testV2.setPassword(password);

        return testV2Mapper.insert(testV2);
    }
}
