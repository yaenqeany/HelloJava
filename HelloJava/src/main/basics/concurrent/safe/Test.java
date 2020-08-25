package main.basics.concurrent.safe;

public class Test {
    public static void main(String[] args) {
        //验证synchronized线程安全
        HasSelfPrivateNum selfPrivateNum = new HasSelfPrivateNum();
        ThreadB threadB = new ThreadB(selfPrivateNum);
        ThreadA threadA = new ThreadA(selfPrivateNum);
        threadA.start();
        threadB.start();

        //验证synchronized产生对象锁及在继承关系中也可重入
        PrintNumThread printNumThread = new PrintNumThread(new Sub());
        Thread thread1 = new Thread(printNumThread,"threadA");
        Thread thread2 = new Thread(printNumThread,"threadB");
        thread1.start();
        thread2.start();

    }
}
