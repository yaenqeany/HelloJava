package main.file_io;

import java.io.File;
import java.io.IOException;

/**
 * File 类主要是对文件夹与文件的属性修改，不能对文件进行读写
 */
public class FileDemo {
    public static void main(String[] args) {
        String dirPath = "C:" + File.separator + "fileDemo";
        String fileName = "demo.txt";
        String dirPath2 = "C:" + File.separator + "newFile";

        File dir = new File(dirPath);
        File file = new File(dir.getAbsoluteFile(), fileName);
        File dir2 = new File(dirPath2);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());

//        dir.renameTo(dir2);
//        file = new File(dir2, fileName);
        System.out.println(dir.getAbsolutePath());
        System.out.println(dir.list());
        String[] files = dir.list();
        System.out.println("============================");
        for (int i=0; i< files.length;i++) {
            System.out.println(files[i]);
        }
//        System.out.println(file.exists());
//        file.renameTo(dir2);
    }
}
