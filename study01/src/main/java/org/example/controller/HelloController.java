package org.example.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // @GetMapping：访问路径 /hello
    @GetMapping("/hello")
    public String hello() {
        // 浏览器访问时，会返回这句话
        return "我学会 Spring Boot 啦！";
    }
}
