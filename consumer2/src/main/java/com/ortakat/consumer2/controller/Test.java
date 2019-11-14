package com.ortakat.consumer2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testing")
public class Test {

    @GetMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep(5000);
        return "Service 2";
    }

}
