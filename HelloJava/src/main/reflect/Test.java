package main.reflect;


public class Test {
    public static void main(String[] args) {
        ReflactDetails details = new ReflactDetails();
//        details.getClassMsg();


        try {
//            details.getConstructors();
//            details.getFields();
//            details.getMethodsMsg();
//            details.reflectMain();
//            details.readProperties();
//            details.reflectGeneric();
            details.reflectSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
