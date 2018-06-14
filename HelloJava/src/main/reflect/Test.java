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
//            details.byProperties();
            details.reflectGeneric();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
