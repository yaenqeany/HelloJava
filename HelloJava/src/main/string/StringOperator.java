package main.string;

import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.HashMap;
import java.util.Map;

/**
 * 字符串操作
 */
public class StringOperator {
    /**
     * 计算一个字符串中的字符出现次数
     *
     * @param string 需要处理的字符串
     */
    public static void charAccount(String string) {
        Map<String, Integer> map = new HashMap();

        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            String str = String.valueOf(chars[i]);
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                int count = map.get(str);
                map.put(str, count + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

    }


    /**
     * 將字符串转为其每个字符对应int数
     *
     * @param string
     * @return
     */
    public int[] exchangeStringToIntArray(String string) {
        char[] chars = string.toCharArray();
        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[i];
        }
        return result;
    }

    /**
     * 尽管在输出中调用intern方法并没有什么效果，但是实际上后台这个方法会做一系列的动作和操作。
     * 在调用”ab”.intern()方法的时候会返回”ab”，但是这个方法会首先检查字符串池中是否有”ab”这个字符串，
     * 如果存在则返回这个字符串的引用，否则就将这个字符串添加到字符串池中，然会返回这个字符串的引用。
     */
    public static void iternMathod() {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        String s7 = "Programming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
        System.out.println(s1 == s7);
        System.out.println(".................................");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s5.hashCode());
        System.out.println(s2.intern().hashCode());
    }

}
