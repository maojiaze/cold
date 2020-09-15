package com.example.cold.service;

import com.example.cold.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mjz
 * @since 2020-09-14
 */
public interface ISysUserService extends IService<SysUser> {

    String login(String userName,String password);

    String register(String userName,String password,Integer roleId) throws Exception;
}
