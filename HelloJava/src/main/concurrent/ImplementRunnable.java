package main.concurrent;

public class ImplementRunnable implements Runnable {
    private String name;

    public ImplementRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " 运行 :  " + i);
            try {
                Thread.sleep((int) Math.random() * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
