package main.basics.concurrent;

public class ImplementRunnable implements Runnable {
    private String name;

    public ImplementRunnable(String name) {
        this.name = name;
    }

    /**
     * ImplementRunnable类通过实现Runnable接口，使得该类有了多线程类的特征。run（）方法是多线程程序的一个约定。
     * 所有的多线程代码都在run方法里面。Thread类实际上也是实现了Runnable接口的类。
     * 在启动的多线程的时候，需要先通过Thread类的构造方法Thread(Runnable target) 构造出对象，
     *      然后调用Thread对象的start()方法来运行多线程代码。
     * 实际上所有的多线程代码都是通过运行Thread的start()方法来运行的。
     * 因此，不管是扩展Thread类还是实现Runnable接口来实现多线程，最终还是通过Thread的对象的API来控制线程的。
     */
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(name + " 运行 :  " + i);
            /*try {
                Thread.sleep((int) Math.random() * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            if (i == 30) {
                Thread.yield();
            }
        }
        System.out.println(name + "  end");
    }
}
