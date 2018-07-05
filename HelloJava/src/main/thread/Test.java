package main.thread;

/**
 * Created by asus1 on 2017-03-20.
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(new LiftOff().status());
        }
    }
}
