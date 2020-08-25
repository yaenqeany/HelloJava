package main.basics.concurrent;

public class Test {
    public static void main(String[] args) {
        /**
         * 注意：start()方法的调用后并不是立即执行多线程代码，而是使得该线程变为可运行态（Runnable），什么时候运行是由操作系统决定的。
         * 从程序运行的结果可以发现，多线程程序是乱序执行。因此，只有乱序执行的代码才有必要设计为多线程。
         * Thread.sleep()方法调用目的是不让当前线程独自霸占该进程所获取的CPU资源，以留出一定时间给其他线程执行的机会。
         * 实际上所有的多线程代码执行顺序都是不确定的，每次执行的结果都是随机的。
         */
        int count = 20;


        ExtendThread thread = new ExtendThread("thread",count);
        Thread thread0 = new Thread(thread);
        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);
        thread0.start();
        thread1.start();
        thread2.start();


        /*new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("thread0 >> " + thread0.getState());
                    System.out.println("thread1 >> " + thread1.getState());
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start()*/;

        /*System.out.println(Thread.currentThread().getName() + "启动");
        Thread thread2 = new Thread(new ImplementRunnable("thread2"));
        Thread thread3 = new Thread(new ImplementRunnable("thread3"));
        thread2.setPriority(10);//当设置了线程优先级最高时，yield方法将在一定程度上失效
        thread2.start();
        thread3.start();
        System.out.println(thread2.isDaemon());//判断是否是后台线程（守护线程）
        thread3.setDaemon(true);//设置线程为守护线程(用户线程和守护线程的区别在于，是否等待主线程依赖于主线程结束而结束)
        try {
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }
}
