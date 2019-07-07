package com.zzy.demo.service;

import com.zzy.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author: zhangzhaoyuan
 * @date: 2019/7/7 11:30
 */

@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}