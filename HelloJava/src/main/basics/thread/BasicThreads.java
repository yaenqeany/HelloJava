package main.basics.thread;

/**
 * Created by asus1 on 2017-03-19.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff(),"lift_Off");
        thread.start();
        System.out.println(Thread.currentThread().getName()+"\t"+"Waiting for LiftOff");
    }
}
