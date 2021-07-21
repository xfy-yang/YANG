package com.example.test.modules.controller;

import com.example.test.modules.entity.TestModel;
import com.example.test.modules.service.MySQLTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mysql/test")
public class MySQLTestController {
    @Autowired
    private MySQLTestService mySQLTestService;

    @PostMapping(value = "/select")
    public List<TestModel> select() throws Exception {
        return mySQLTestService.select();
    }

    @PostMapping(value = "/insert")
    public int insert(@RequestParam(value = "name") String name) throws Exception {
        return mySQLTestService.insert(name);
    }
}
