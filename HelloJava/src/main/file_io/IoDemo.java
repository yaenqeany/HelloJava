package main.file_io;

import java.io.*;

public class IoDemo {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        OutputStream outputStream = null;
        BufferedOutputStream bos = null;

        Writer writer = null;
        BufferedWriter bw = null;
//        try {
//            outputStream = new FileOutputStream(file);
////            outputStream.write("abc".getBytes());
//
//            bos = new BufferedOutputStream(outputStream);
//            bos.write("vnm".getBytes());
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
////                outputStream.flush();
////                outputStream.close();
//
//                bos.flush();
//                bos.close();
//
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        try {
            writer = new FileWriter(file);
//            writer.write("sadfjlsajflkajfklsdafdlk");
            bw = new BufferedWriter(writer);
            bw.newLine();
            bw.append("BufferedWriter");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //                writer.flush();
//                writer.close();

            try {
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
