package main.design.callback;

import java.util.List;

public enum Teacher implements ITeacher {

    MATH_TEACHER {
        @Override
        public void judgeAnswer(int answer, Student student) {
            if (3 == answer) {
                System.out.println("Good " + student.getName() + ", you get right answer!");
            } else {
                System.out.println("Sorry " + student.getName() + ", you get wrong answer!");
            }
        }

        @Override
        public void judgeAnswer(String answer, Student student) {

        }
    },
    CHI_TEACHER {
        @Override
        public void judgeAnswer(int answer, Student student) {

        }

        @Override
        public void judgeAnswer(String answer, Student student) {
            if ("China".equals(answer)) {
                System.out.println("Yes " + student.getName() + ", China!");
            } else {
                System.out.println("CHI_TEACHER : " + student.getName() + " wrong......");
            }
        }
    };


    public void askQuestion(List<Student> students) {
        for (Student student :
                students) {
            student.resolveQuestion(this);
        }
    }

}
