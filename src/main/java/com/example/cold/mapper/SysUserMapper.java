package com.example.cold.mapper;

import com.example.cold.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mjz
 * @since 2020-09-14
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    String  getPasswordByUserName(String userName);

    String getRoleByUserName(String userName);

}
