package com.example.test.modules.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @RequestMapping(value = "/gateway")
    public String gateway() {
        return "Hello World";
    }
}
