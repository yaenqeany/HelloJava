package main.design.callback;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("XiaoMing","China",1));
        students.add(new Student("XiaoZhang","abc",3));
        Teacher.MATH_TEACHER.askQuestion(students);
        Teacher.CHI_TEACHER.askQuestion(students);
    }
}
