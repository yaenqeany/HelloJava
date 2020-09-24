package main.basics.concurrent.safe;

public class Father {
    public int i = 12;

    synchronized public void printNum() {
        System.out.println(Thread.currentThread().getName() + "  father print " + i);
        i--;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
