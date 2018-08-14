package main.design.callback;

public class Student implements IStudent {
    private String name;
    private String chiAnswer;
    private int mathAnswer;

    public Student(String name, String chiAnswer, int mathAnswer) {
        this.name = name;
        this.chiAnswer = chiAnswer;
        this.mathAnswer = mathAnswer;
    }

    @Override
    public void resolveQuestion(ITeacher teacher) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (teacher.equals(Teacher.MATH_TEACHER)) {
            teacher.judgeAnswer(this.mathAnswer,this);
        } else {
            teacher.judgeAnswer(this.chiAnswer,this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
