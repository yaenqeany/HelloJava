package main.basics.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ChannelDemo {
    public static void main(String[] args) {
        //使用直接缓冲区方式——可以明显提升效率
        try {
            //jdk1.7开始提供的获取通道的方式
            FileChannel inChannel = FileChannel.open(Paths.get("demo.txt"), StandardOpenOption.READ);
            FileChannel outChannel = FileChannel.open(Paths.get("demo2.txt"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE_NEW);

            MappedByteBuffer inBuffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
            MappedByteBuffer outBuffer = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

            byte[] dst = new byte[inBuffer.limit()];
            inBuffer.get(dst);
            outBuffer.put(dst);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //jdk1.7之前的通道使用方式
        FileChannel readChannel = null;
        FileChannel writeChannel = null;
        try {
            RandomAccessFile sourceFile = new RandomAccessFile("demo.txt", "rw");
            RandomAccessFile dstFile = new RandomAccessFile("demo2.txt", "rw");
            readChannel = sourceFile.getChannel();
            writeChannel = dstFile.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            while (-1 != readChannel.read(byteBuffer)) {
                byteBuffer.flip();
                byte[] dst = new byte[byteBuffer.limit()];
                byteBuffer.get(dst);
                writeChannel.write(byteBuffer);
                byteBuffer.clear();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                readChannel.close();
                writeChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //分散读取与聚集写入
        /*FileChannel readChannel = null;
        FileChannel writeChannel = null;
        try {
            RandomAccessFile sourceFile = new RandomAccessFile("demo.txt", "rw");
            RandomAccessFile dstFile = new RandomAccessFile("demo2.txt", "rw");
            readChannel = sourceFile.getChannel();
            writeChannel = dstFile.getChannel();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        
    }
}
