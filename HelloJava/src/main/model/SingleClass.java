package main.model;

/**
 * Created by asus1 on 2017-03-20.
 */
public class SingleClass {

    //2、声明受保护的静态实例化变量
    private static SingleClass ourInstance = new SingleClass();

    //3、提供静态方法返回实例
    public static SingleClass getInstance() {
        return ourInstance;
    }

    //1、构造函数私有化
    private SingleClass() {
    }

}
