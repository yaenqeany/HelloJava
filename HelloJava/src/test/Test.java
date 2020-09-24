package test;

import main.basics.enums.WeekDay;

public class Test {
    public static void main(String[] args) {
        System.out.println(WeekDay.MONDAY.getName());
        System.out.println(WeekDay.MONDAY.getIndex());

        System.out.println(WeekDay.THURSDAY.show(WeekDay.FRIDAY));
    }
}
