package com.example.cold.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author mjz
 * @since 2020-09-14
 */
@Data
@TableName(value = "sys_user")
@EqualsAndHashCode(callSuper = false)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField(value = "id")
    private Long Id;

    @TableField(value="user_name")
    private String userName;

    @TableField(value="password")
    private String password;

    @TableField(value="role_id")
    private Integer roleId;


}
