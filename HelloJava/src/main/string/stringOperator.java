package main.string;import java.lang.Integer;import java.lang.String;import java.lang.System;import java.util.HashMap;
import java.util.Map;

/**
 * 字符串操作
 */
public class stringOperator {
    /**
     * 计算一个字符串中的字符出现次数
     * @param string 需要处理的字符串
     */
    public static void charAccount(String string) {
        Map<String,Integer> map = new HashMap();

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
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

    }
}
