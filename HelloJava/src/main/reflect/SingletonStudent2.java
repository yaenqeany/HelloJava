package main.reflect;

public class SingletonStudent2 {
    private static int count = 0;
    private static SingletonStudent2 ourInstance = null;

    public static SingletonStudent2 getInstance() {
        if (null == ourInstance) {
            ourInstance = new SingletonStudent2();
        }
        return ourInstance;
    }

    private SingletonStudent2() {
        synchronized (SingletonStudent2.class) {
            if (count > 0) {
                throw new RuntimeException("无法创建实例");
            }
            count++;
        }
    }
}
