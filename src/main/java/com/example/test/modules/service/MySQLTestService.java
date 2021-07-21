package com.example.test.modules.service;

import com.example.test.modules.dao.TestMapper;
import com.example.test.modules.entity.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySQLTestService {
    /****
     * 这里使用 @Autowired 自动装配TestMapper时会有报错，原因是TestMapper使用了@Mapper注解，idea不能把@Mapper注解的TestMapper识别为Bean，
     * 但实际运行时@Mapper会被Spring识别为Bean，自动装配不会出错。所以这里的报错可以不用在意。
     * 但如果看着代码中有报错很不顺眼，可以在TestMapper类增加@Repository注解，标注该类为DAO组件。
     */
    @Autowired
    private TestMapper testMapper;  //这里会有报错，不用管

    public List<TestModel> select() {
        return testMapper.select();
    }

    public int insert(String name) {
        return testMapper.insert(name);
    }
}
