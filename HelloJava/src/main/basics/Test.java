package main.basics;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * Created by asus1 on 2017-03-18.
 */
public class Test {
    public static void main(String[] args) {
//        Const con = new Const("sdfkl");
        /*StringOperator stringOperator = new StringOperator();
        int[] result = stringOperator.exchangeStringToIntArray("abcGDK&**");
        System.out.println(Arrays.toString(result));
        float f = 3.4f;
        float f1 = (float) 3.14;

        short s = 1;
        short s1 = (short) (s+1);

        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

        stringOperator.hashCode();*/

       /* int a = 1;
        int b = a;
        a = 3;
        System.out.println("int a = "+ a );
        System.out.println("int b = "+ b );

        String s1 = "abc";
        String s2 = s1;
        s1 = "111";
        System.out.println("string s1 = " + s1);
        System.out.println("string s2 = " + s2);

        String s3 = new String("ssss");
        String s4 = new String(s3);
        s3 = "vvvv";
        System.out.println("string s3 = " + s3);
        System.out.println("string s4 = " + s4);*/
        testMap();
    }

    public static void testMap() {
        Map<String, String> map = new HashMap();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");

        map.forEach((key, value) -> System.out.println(
                key + "==" + value
        ));

        List<String> list = new ArrayList<>();
        list.add("b");
        String s = new String("b");
        System.out.println(list.hashCode());
        System.out.println(s.hashCode());

        testSort();
    }

    public static void testSort() {
        int[] ints = {7, 5, 6, 3, 4, 2, 1};
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < ints.length; i++) {
            for (int j = ints.length-1; j >i; j--) {
                if (ints[i] > ints[j]) {
                    int tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + i);
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length-1; j++) {
                if (ints[j] > ints[j+1]) {
                    int tmp = ints[j+1];
                    ints[j+1] = ints[j];
                    ints[j] = tmp;
                }
            }
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<" + i);
            System.out.println(Arrays.toString(ints));
        }
    }
}
