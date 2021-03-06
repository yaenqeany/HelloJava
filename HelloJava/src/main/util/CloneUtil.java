package main.util;

import java.io.*;

public class CloneUtil {
    private CloneUtil() {
        throw new AssertionError();
    }

    public static <T extends Serializable> T clone(T obj) throws Exception {
        //将对象转换为流
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bout);
        //写出到输出流中
        oos.writeObject(obj);
        //输出流转化为输入流
        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        //从输入流中读取对象信息
        ObjectInputStream ois = new ObjectInputStream(bin);
        return (T) ois.readObject();

        /**
         * 调用ByteArrayInputStream或ByteArrayOutputStream对象的close方法没有任何意义
         * 这两个基于内存的流只要垃圾回收器清理对象就能够释放资源，这一点不同于对外部资源（如文件流）的释放
         *
         * 基于序列化和反序列化实现的克隆不仅仅是深度克隆，更重要的是通过泛型限定，可以检查出要克隆的对象是否支持序列化，
         * 这项检查是编译器完成的，不是在运行时抛出异常，这种是方案明显优于使用Object类的clone方法克隆对象。
         * 让问题在编译的时候暴露出来总是好过把问题留到运行时。
         */
    }
}
