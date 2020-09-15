package com.example.cold.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author mjz
 * @since 2020-09-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "sys_role")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private  Long id;

    @TableField(value = "name")
    private String name;

    @TableField(value = "shownName")
    private String showName;


}
