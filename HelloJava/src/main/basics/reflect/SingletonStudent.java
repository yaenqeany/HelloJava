package main.basics.reflect;

public class SingletonStudent {
    private static SingletonStudent ourInstance = new SingletonStudent();

    public static SingletonStudent getInstance() {
        return ourInstance;
    }

    private SingletonStudent() {
    }
}
