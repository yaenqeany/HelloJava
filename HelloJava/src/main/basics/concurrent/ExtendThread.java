package main.basics.concurrent;

public class ExtendThread extends Thread {
    private String name;
    private int count;

    public ExtendThread(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void run() {
        while (count > 0) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " " + count);
                count--;
            }
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*for (int i = 0; i < 5; i++) {
            System.out.println(this.name + "  " + this.getState());
            System.out.println(name + " is running " + i);
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }
}
