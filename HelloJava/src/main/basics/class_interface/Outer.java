package main.basics.class_interface;

/**
 * Created by asus1 on 2017-03-05.
 */
public class Outer {

    static class Inner {
        static int AN=12;
    }

    public static void getInner(Inner inner) {
        System.out.println(inner.AN);
    }

    public static void main(String[] args) {
        getInner(new Inner());
    }
}
