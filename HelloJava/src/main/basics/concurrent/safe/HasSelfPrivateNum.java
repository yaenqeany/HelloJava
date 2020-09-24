package main.basics.concurrent.safe;

public class HasSelfPrivateNum {
    private int num = 0;

    public void setNum(String name) throws InterruptedException {
        if ("a".equals(name)) {
            num = 100;
            System.out.println("a set num");
            Thread.sleep(2000);
        } else {
            num = 200;
            System.out.println("b set num");

        }
        System.out.println(name + " " + num);

    }

    synchronized public void setNum2(String name) throws InterruptedException {
        if ("a".equals(name)) {
            num = 10;
            System.out.println("a setNum2");
            Thread.sleep(2000);
        } else {
            num = 20;
            System.out.println("b setNum2");

        }
        System.out.println(name + " " + num);

    }
}
