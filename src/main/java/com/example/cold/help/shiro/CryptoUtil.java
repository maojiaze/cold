package com.example.cold.help.shiro;

import org.apache.shiro.crypto.hash.Md5Hash;

public class CryptoUtil{

    //需要传入两个参数，第一个是密码，第二个是盐,测试只用固定的盐值
    public static String md5(String str){
        String salt="cold";
        return new Md5Hash(str,salt).toString();
    }
}
