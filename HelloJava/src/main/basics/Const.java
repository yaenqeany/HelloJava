package main.basics;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Created by asus1 on 2017-03-18.
 */
class Const {
    public Const(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        Const con = new Const("sss");
    }


}
