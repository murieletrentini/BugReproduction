package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/base")
    public Base get() {
        Extended extended = new Extended();
        extended.setBaseProperty("base");
        extended.setExtendedProperty("extended");
        return extended;
    }
}
