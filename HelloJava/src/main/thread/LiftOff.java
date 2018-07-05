package main.thread;

/**
 * Created by asus1 on 2017-03-19.
 */
public class LiftOff implements Runnable {
    protected int countDown =10;
    private static int taskCount=0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + ")";
    }

    @Override
    public void run() {
//        Thread.currentThread().setName("LiftOff");
//        System.out.println(Thread.currentThread().getName());
        while (countDown-- > 0) {
            System.out.print(status()+"\t");
            Thread.yield();
        }
    }
}
