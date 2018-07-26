package main.basics.concurrent;

/**
 * 问题：建立三个线程，A线程打印10次A，B线程打印10次B,C线程打印10次C，要求线程同时运行，交替打印10次ABC。
 * 这个问题用Object的wait()，notify()就可以很方便的解决。
 */
public class SynDemo implements Runnable{
    private String name;
    private Object prev;
    private Object self;

    private SynDemo(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name+count);
                    count--;
                    self.notify();

                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        SynDemo pa = new SynDemo("A", c, a);
        SynDemo pb = new SynDemo("B", a, b);
        SynDemo pc = new SynDemo("C", b, c);

        try {
            new Thread(pa).start();
            Thread.sleep(1000);  //确保按顺序A、B、C执行
            new Thread(pb).start();
            Thread.sleep(1000);
            new Thread(pc).start();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
