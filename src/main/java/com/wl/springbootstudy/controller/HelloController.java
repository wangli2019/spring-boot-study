package com.wl.springbootstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author wl
 *
 * @description 你好，世界
 * @date 2020.3.15
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/say")
    public String hello(){
        return "Hello,world!";
    }
}
