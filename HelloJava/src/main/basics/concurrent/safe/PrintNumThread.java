package main.basics.concurrent.safe;

public class PrintNumThread extends Thread {
    private Sub sub;

    public PrintNumThread(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.printNum2();

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
