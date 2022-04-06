package com.llm.goodsSecKill.common.utils;


import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.crypto.digest.Digester;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * @description: md5加密工具类
 * @author: LiuLuMing
 * @createtime: 2022-04-01 14:37
 */
public class MD5Util {

    private static final String salt = "1a2b3c4d";

    /**
     * 功能说明: 通过MD5加密
     *
     * @param str 需要加密的参数
     * @return java.lang.String
     * @author  LiuLuMing
     * @createtime  2022/4/1 14:56
     */
    public static String MD5(String str) {
        return DigestUtil.md5Hex(str);
    }

    /**
     * 功能说明: 第一次加密
     *
     * @param password 明文密码
     * @return 返回加了密的密码
     * @author  LiuLuMing
     * @createtime  2022/4/1 15:46
     */
    public static String firstEncryption(String password) {
        String str = "" + salt.charAt(0) + salt.charAt(2) + password + salt.charAt(5) + salt.charAt(4);
        return MD5(str);
    }

    /**
     * 功能说明: 第二次加密
     *
     * @param password 第一次加密后的密码
     * @return 返回加了密的密码
     * @author  LiuLuMing
     * @createtime  2022/4/1 15:46
     */
    public static String secondEncryption(String password, String salt) {
        String str = salt.charAt(0) + salt.charAt(2) + password + salt.charAt(5) + salt.charAt(4);
        return MD5(str);
    }

    public static String encryption(String password, String salt) {
        String firstEncryption = firstEncryption(password);
        String secondEncryption = secondEncryption(firstEncryption, salt);
        return secondEncryption;
    }

    public static void main(String[] args) {
        //d3b1294a61a07da9b49b6e22b2cbd7f9  ce21b747de5af71ab5c2e20ff0a60eea
        System.out.println(firstEncryption("123456"));
    }

}
