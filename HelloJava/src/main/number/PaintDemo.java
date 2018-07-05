package main.number;

import sun.text.resources.cldr.om.FormatData_om;

/**
 * Created by asus1 on 2017-02-25.
 */
public class PaintDemo {

    /**
     * 打印空心正三角
     * @param n 行数
     */
    public void paintStar(int n) {
        //打印第n-1行
        for (int i = 0; i < n-1; i++) {
            //内层循环控制列
            for (int j = 1; j <2*n-1 ; j++) {
                if (j == n + i) {//获取最后一颗*的位置
                    System.out.println("*");
                    break;
                }else if (j == n - i) {//获取第一颗*的位置
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        //打印末行
        for (int i = 0; i < 2*n-1; i++) {
            System.out.print("*");
        }
    }



}
