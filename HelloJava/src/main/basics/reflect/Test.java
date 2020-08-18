package main.basics.reflect;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        ReflactDetails details = new ReflactDetails();
//        details.getClassMsg();

        /*Test test = new Test();
        Student stu = test.getStu();*/
//        System.out.println(stu.getAge());


        String string = "abc";
        int size = string.length();
        string = "000000" + string;

        string = string.substring(size);

        System.out.println(string);
        System.out.println(string.length());

//        System.out.println(string.substring(0,3));


        try {
//            details.getConstructors();
//            details.getFields();
//            details.getMethodsMsg();
//            details.reflectMain();
//            details.readProperties();
//            details.reflectGeneric();
//            details.reflectSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    Student getStu() {
        return new Student();
    }

    public void changeStuField(Student student) {
        student.age=12;
        student.name = "aa";
    }

}
