package main.reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        ReflactDetails details = new ReflactDetails();
        details.getClassMsg();


        try {
            details.getConstructors();
            details.getFields();
            details.getMethodsMsg();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
