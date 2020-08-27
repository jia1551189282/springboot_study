package com.jiajia.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zjiajia
 * @date 2020/8/27 7:52
 */



@Controller
public class HellowordController {

    @RequestMapping("test")
    @ResponseBody
    public String helloword(){

        return "hello springboot";
    }
}
