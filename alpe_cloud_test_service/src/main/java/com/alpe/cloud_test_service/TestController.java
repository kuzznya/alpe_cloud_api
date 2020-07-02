package com.alpe.cloud_test_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${test.value}")
    private String testValue;

    private final org.springframework.core.env.Environment env;

    public TestController(org.springframework.core.env.Environment env) {
        this.env = env;
    }

    @GetMapping
    public String test() {
        return testValue;
    }

    @PostMapping
    public void setTestValue(@RequestParam String value) {
        this.testValue = value;
    }

    @DeleteMapping
    public void resetTestValue() {
        this.testValue = env.getProperty("test.value");
    }
}
