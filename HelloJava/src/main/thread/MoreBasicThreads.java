package main.thread;

/**
 * Created by asus1 on 2017-03-19.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
            System.out.println("Waiting for LiftOff");
        }
    }
}
