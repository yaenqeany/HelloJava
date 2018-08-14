package main.design.singleton;

/**
 * Created by asus1 on 2017-03-20.
 */
public class Simple {
    //2、声明受保护的静态实例化变量
    private static Simple ourInstance = new Simple();

    //3、提供静态方法返回实例
    public static Simple getInstance() {
        return ourInstance;
    }

    //1、构造函数私有化
    private Simple() {
    }
}

class LazyDemo{
    private static LazyDemo instance;

    private LazyDemo() {
    }

    public static LazyDemo getInstance() {
        if (null == instance) {
            return new LazyDemo();
        }
        return instance;
    }
}

class InnerClassDemo {
    private static class Innerclass {
        private static Innerclass instance = new Innerclass();
    }

    public Innerclass getInstance() {
        return Innerclass.instance;
    }

    private InnerClassDemo() {

    }
}

enum EnumDemo {
    INCTANCE;

    public void doSomething() {

    }
}

class DoubleCheckDemo {
    private volatile static DoubleCheckDemo instance;

    private DoubleCheckDemo() {

    }
    public static DoubleCheckDemo getInstance(){
        if(instance==null){
            synchronized (DoubleCheckDemo.class){
                if(instance==null){
                    instance=new DoubleCheckDemo();
                }
            }
        }
        return instance;
    }

}


