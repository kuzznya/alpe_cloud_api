package com.alpe.cloud_test_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${test.value}")
    private String testValue;

    @GetMapping
    public String test() {
        return testValue;
    }

    @PostMapping
    public void setTestValue(@RequestParam String value) {
        this.testValue = value;
    }
}
