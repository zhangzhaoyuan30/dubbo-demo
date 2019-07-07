package com.zzy.demo.controller;

import com.zzy.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangzhaoyuan
 * @date: 2019/7/7 12:46
 */
@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String word) {
        return helloService.sayHello(word + "world");
    }
}
