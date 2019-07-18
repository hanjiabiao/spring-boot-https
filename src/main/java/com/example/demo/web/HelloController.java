package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Author: 韩家彪
 * @Date: 2019/7/16 15:42
 * @Description: TODO
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello world";
    }

}
