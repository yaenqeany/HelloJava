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
        IoDemo ioDemo = new IoDemo();
//        ioDemo.fileReadByStresm(file);
        ioDemo.fileReadByReader(file);
    }

    public void fileReadByStresm(File file) {
        if (null == file || !file.isFile()) {
            System.out.println("parameter error : file is null or not a file!");
        } else {
            InputStream inputStream = null;
            BufferedInputStream bis = null;
            try {
                inputStream = new FileInputStream(file);
                bis = new BufferedInputStream(inputStream);
                byte[] bytes = new byte[12];//读取结果数组容器
                while (true) {
                    int result = inputStream.read();
                    if (-1 != result) {
                        System.out.println((char) result);
                    } else {
                        break;
                    }
                    /*int result = inputStream.read(bytes);
                    if (-1 != result) {
                        for (int i = 0; i < result; i++) {
                            System.out.println((char) bytes[i]);
                        }
                    } else {
                        break;
                    }*/
/*//                    result = bis.read();
                    result = bis.read(bytes);
                    if (-1 != result) {
                        System.out.println((char) result);
                        System.out.println("===========");
                    } else {
                        break;
                    }*/
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    inputStream.close();
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void fileReadByReader(File file) {
        if (null == file || !file.isFile()) {
            System.out.println("parameter error : file is null or not a file!");
        } else {
            Reader reader = null;
            BufferedReader br = null;
            try {
                reader = new FileReader(file);
                br = new BufferedReader(reader);
                while (true) {
                    /*int result = reader.read();
                    if (-1 != result) {
                        System.out.println((char)result);
                    }*/
                    String result = br.readLine();
                    if (null != result && "" != result) {
                        System.out.println(result);
                    } else {
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
