package com.example.cold.controller;


import com.example.cold.help.BaseResponse;
import com.example.cold.service.ISysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Security;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mjz
 * @since 2020-09-14
 */
@RestController
@RequestMapping("/sys")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;

    /**
     * 登陆
     * @param userName
     * @param password
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public BaseResponse login(@RequestParam("userName") String userName,@RequestParam("password")String password){
         BaseResponse baseResponse=new BaseResponse(1,sysUserService.login(userName,password));
         return  baseResponse;
    }

    /**
     * 注销
     */
    @RequestMapping("/logout")
    public String logout(){
        Subject subject=SecurityUtils.getSubject();
        subject.logout();
        return "注销成功";
    }

    @RequestMapping("/cs")
    @RequiresRoles("user")
    public void cs(){
        System.out.println("测试成功");
    }

}
