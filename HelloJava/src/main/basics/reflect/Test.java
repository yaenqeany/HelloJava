package main.basics.reflect;


public class Test {
    public static void main(String[] args) {
        ReflectDetails details = new ReflectDetails();
        details.getClassMsg();


        /*Test test = new Test();
        Student stu = test.getStu();*/
//        System.out.println(stu.getAge());


        /*String string = "abc";
        int size = string.length();
        string = "000000" + string;

        string = string.substring(size);

        System.out.println(string);
        System.out.println(string.length());*/

//        System.out.println(string.substring(0,3));


        try {
            details.getConstructors();
            details.getFields();
            details.getMethodsMsg();
            details.reflectMain();
            details.readProperties();
            details.reflectGeneric();
            details.reflectSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }


        /*Student student = new Student("zhangsan", 18);
        ChangeStudent changeStudent = new ChangeStudent();
        changeStudent.change(student);
        System.out.println(student.toString());
        Test test = new Test();
        test.changeStuField(student);
        System.out.println(student.toString());*/

//        String string = "亲情账户成员账户维护";
//        String string = "abcdef";
//        char[] chars = string.toCharArray();
//        String unicodeBytes = "";
//        for (int i = 0; i < chars.length; i++) {
//            String hexString = Integer.toHexString(chars[i]);
//            if (hexString.length() <= 2) {
//                hexString += "00";
//            }
//            unicodeBytes = unicodeBytes + "\\u" + hexString;
//        }
//        System.out.println(unicodeBytes);
//
//    }
//
//    Student getStu() {
//        return new Student();
//    }
//
//    public void changeStuField(Student student) {
//        student.age=12;
//        student.name = "aa";
    }

}
