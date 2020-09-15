package com.example.cold.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shiro")
public class ShiroController {
    @RequestMapping("/notLogin")
    public void notLogin() throws Exception {
        throw new Exception("用户未登陆");
        //return "用户未登陆";
    }

    @RequestMapping("/notRole")
    public void notRole() throws Exception {
        throw new Exception("用户无权限");
    }
}
