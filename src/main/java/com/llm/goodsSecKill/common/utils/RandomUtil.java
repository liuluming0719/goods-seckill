package com.llm.goodsSecKill.common.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @description: 生成随机字符串工具类
 * @author: LiuLuMing
 * @createtime: 2022-04-02 10:09
 */
public class RandomUtil {

    private static final String[] GENERATE_SOURCE = new String[]{"0", "1", "2", "3", "4", "5", "6", "7",

            "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",

            "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "p", "q", "r", "s", "t", "u", "v",

            "w", "x", "y", "z"};

    private static final int STR_LEN = GENERATE_SOURCE.length;

    /**
     * 功能说明:  使用 Collections.shuffle 生成六位随机字符串
     *
     * @return java.lang.String
     * @author  LiuLuMing
     * @createtime  2022/4/2 10:16
     */
    private static String generateByShuffle(int count) {
        List<String> list = Arrays.asList(GENERATE_SOURCE);
        //打乱顺序 增加反推难度
        Collections.shuffle(list);
        StringBuilder randomStr = new StringBuilder();
        for (int i = 0; i < STR_LEN; i++) {
            randomStr.append(list.get(i));
        }
        return randomStr.substring(0,count);
    }

    /**
     * 功能说明: 根据传入位数来随机生成
     *
     * @param count 随机数位数
     * @return java.lang.String
     * @author  LiuLuMing
     * @createtime  2022/4/2 10:25
     */
    public static String generateRandom(int count) {

        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) {

            final int index = new Random().nextInt(STR_LEN);

            sb.append(GENERATE_SOURCE[index]);

        }

        return sb.toString();
    }

}
