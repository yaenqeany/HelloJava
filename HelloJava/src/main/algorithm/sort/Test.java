package main.algorithm.sort;

import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
/*
        int[] ints = {6,3,1,7,0,4};
        for (int i=0;i<ints.length-1;i++) {
            for (int j=ints.length-1;j>i;j--) {
                if (ints[i] > ints[j]) {
                    int tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
*/
//        popSort.doWrite();
        /*try {
            BufferedReader br = new BufferedReader(new FileReader(new File("tmp.txt")));
            while (true) {
                String line = br.readLine();
                if (null != line) {
                    System.out.println(line);
                } else {
                    break;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        String string = "aaa|bb|";

        System.out.println(Arrays.toString(string.split("\\|")));
//        System.out.println(string.substring(0,string.indexOf("Rows")).trim());
//        System.out.println(string.indexOf("Rows"));
    }
}
