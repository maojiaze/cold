package com.example.cold.controller;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.DigestUtil;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        String testStr="cold123456";
        String md5Hex1 = DigestUtil.md5Hex(testStr);
        System.out.println(md5Hex1);
        System.out.println(IdUtil.simpleUUID());
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        long id = snowflake.nextId();
        long id2 =snowflake.nextId();
        System.out.println(id);
        System.out.println(id2);
        System.out.println(RandomUtil.randomInt(1));
    }
}
