package main.basics.concurrent.safe;

public class ThreadB extends Thread {
    private HasSelfPrivateNum selfPrivateNum;

    public ThreadB(HasSelfPrivateNum selfPrivateNum) {
        this.selfPrivateNum = selfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        try {
            selfPrivateNum.setNum("b");
            selfPrivateNum.setNum2("b");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
