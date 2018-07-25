package main.sort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
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
    }
}
