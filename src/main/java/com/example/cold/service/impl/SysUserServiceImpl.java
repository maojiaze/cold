package com.example.cold.service.impl;

import com.example.cold.entity.SysUser;
import com.example.cold.mapper.SysUserMapper;
import com.example.cold.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mjz
 * @since 2020-09-14
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    @Autowired
    private SysUserMapper userMapper;

    @Override
    public String login(String userName,String password) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        // 执行认证登陆
        subject.login(token);
        //根据权限，指定返回数据
        String role = userMapper.getRoleByUserName(userName);
        if ("user".equals(role)) {
            return "欢迎登陆";
        }
        if ("admin".equals(role)) {
            return "欢迎来到管理员页面";
        }
        return "权限错误";
    }
}
