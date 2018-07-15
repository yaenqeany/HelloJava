package main.basics;

import java.util.ArrayList;
import java.util.List;

public class ParameterTransfer {
    public static void change(int i){
        i *= 10;
        System.out.println(i);
    }

    public static void change(List list){
        list.remove(0);
        list.add(0,"changed");
        System.out.println(list.get(0));
    }

    public static void change(String string){
        string += "_append";
        System.out.println(string);
    }

    public static void change(StringBuffer stringBuffer) {
        stringBuffer.append("_changed");
        System.out.println(stringBuffer.toString());
    }



    public static void main(String[] args) {
        int i =2;
        System.out.println(i);//2
        change(i);//20
        System.out.println(i);//2
        System.out.println("====================================");

        List list = new ArrayList();
        list.add(0,"before");
        System.out.println(list.get(0));//before
        change(list);//changed
        System.out.println(list.get(0));//changed
        System.out.println("====================================");

        String string = "abc";
        System.out.println(string);//abc
        change(string);//abc_append
        System.out.println(string);//abc
        System.out.println("====================================");

        StringBuffer stringBuffer = new StringBuffer("abc");
        System.out.println(stringBuffer.toString());
        change(stringBuffer);
        System.out.println(stringBuffer.toString());
        System.out.println("====================================");


    }
}
