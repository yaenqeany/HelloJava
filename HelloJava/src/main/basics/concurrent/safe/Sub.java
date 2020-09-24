package main.basics.concurrent.safe;

public class Sub extends Father {
    synchronized public void printNum2() {
        while (i > 0) {
            System.out.println(Thread.currentThread().getName() + "  sub print " + i);
            i --;
            try {
                Thread.sleep(200);
                printNum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
