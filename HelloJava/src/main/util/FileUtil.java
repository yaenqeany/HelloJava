package main.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static void main(String[] args) {
        File file = new File("pro.properties");
        FileUtil fileUtil = new FileUtil();
       /* String path = fileUtil.searchFile("C:\\", "pro.properties");
        System.out.println(path);*/

       /* System.out.println("------------------------------------------");

        List<String> result = fileUtil.searchFiles("C:/git", "pro.properties");
        for (String tmp : result) {
            System.out.println(tmp);
        }*/
        fileUtil.copyFile("C:/IO.png","C:/New folder");

        InputStream inputStream = new BufferedInputStream(new ByteArrayInputStream(new byte[4]));

    }

    /**
     * 递归查询给定文件夹路径下的文件(单一文件查找)
     *
     * @param dirPath  搜索的文件夹路径（绝对路径）
     * @param fileName 需要搜索的文件名（带后缀）
     * @return null（不存在） or 文件的绝对路径
     */
    public String searchFile(String dirPath, String fileName) {
        File directory = new File(dirPath);
        File[] files = directory.listFiles();
        String path = null;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                String tmp = files[i].getAbsolutePath();
                String name = tmp.substring(tmp.lastIndexOf(File.separator) + 1);
                if (name.equals(fileName)) {
                    path = files[i].getAbsolutePath();
                    return path;
                }
            } else if (files[i].isDirectory()) {
                path = searchFile(files[i].getAbsolutePath(), fileName);
                if (null != path) {
                    return path;
                }
            }
        }
        return path;
    }

    /**
     * 递归查询给定文件夹路径下的文件
     *
     * @param dirPath  搜索的文件夹路径（绝对路径）
     * @param fileName 需要搜索的文件名（带后缀）
     * @return 文件的绝对路径的集合
     */
    public List<String> searchFiles(String dirPath, String fileName) {
        File directory = new File(dirPath);
        File[] files = directory.listFiles();
        List<String> result = new ArrayList();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                String tmp = files[i].getAbsolutePath();
                String name = tmp.substring(tmp.lastIndexOf(File.separator) + 1);
                if (name.equals(fileName)) {
                    result.add(files[i].getAbsolutePath());
                }
            } else if (files[i].isDirectory()) {
                List<String> subResult = searchFiles(files[i].getAbsolutePath(), fileName);
                if (null != subResult && !subResult.isEmpty()) {
                    for (String tmp : subResult) {
                        result.add(tmp);
                    }
                }
            }
        }
        return result;
    }

    /**
     * 使用filter过滤文件夹，搜索目标文件
     *
     * @param dirPath  文件夹绝对路径
     * @param keywords 搜索关键字
     * @return
     */
    public List<String> filterFiles(String dirPath, String keywords) {
        File directory = new File(dirPath);
        List<String> results = new ArrayList<>();
        File[] files = directory.listFiles(pathname -> {
            if (pathname.isDirectory() || (pathname.isFile() && pathname.getName().contains(keywords))) return true;
            return false;
        });

        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                results.add(files[i].getAbsolutePath());
            } else {
                List<String> tmp = filterFiles(files[i].getAbsolutePath(), keywords);
                if (tmp != null) {
                    for (String name : tmp) {
                        results.add(name);
                    }
                }
            }
        }
        return results;
    }

    public int copyFile(String filePath, String destPath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return -1;
        }
        File dir = new File(destPath);
        if (!dir.exists()) {
            return -1;
        }
        File destFile = new File(dir,file.getName());
        InputStream ins = null;
        OutputStream ops = null;
        try {
            ins = new FileInputStream(file);
            ops = new FileOutputStream(destFile);
            while (true) {
                int read = ins.read();
                if (-1 != read) {
                    ops.write(read);
                } else {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                ops.flush();
                ops.close();
                ins.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return 1;
    }
}
