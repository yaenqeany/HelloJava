package main.util;

import java.io.File;

public class FileUtil {
    public static void main(String[] args) {
        File file = new File("pro.properties");
        FileUtil fileUtil = new FileUtil();
        String path = fileUtil.searchFile(file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf(File.separator)), "pro.properties");
        System.out.println(path);
    }

    /**
     * 递归查询给定文件夹路径下的文件
     * @param dirPath 搜索的文件夹路径（绝对路径）
     * @param fileName 需要搜索的文件名（带后缀）
     * @return null（不存在） or 文件的绝对路径
     */
    public String searchFile(String dirPath, String fileName) {
        File project = new File(dirPath);
        File[] files = project.listFiles();
        String path = null;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                String tmp = files[i].getAbsolutePath();
                String name = tmp.substring(tmp.lastIndexOf(File.separator) + 1);
                if (name.equals(fileName)) {
                    path =  files[i].getAbsolutePath();
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
}