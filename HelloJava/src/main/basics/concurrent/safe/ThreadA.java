package main.basics.concurrent.safe;

public class ThreadA extends Thread {
    private HasSelfPrivateNum selfPrivateNum;

    public ThreadA(HasSelfPrivateNum selfPrivateNum) {
        this.selfPrivateNum = selfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        try {
            selfPrivateNum.setNum("a");
            selfPrivateNum.setNum2("a");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
