package main.basics.number;

public class numDemo {

    /**
     * 判断一个整数数是否为奇数
     * @param num 目标数字
     * @return 判断结果：true——是一个奇数；false——不是奇数
     */
    public static boolean isOdd(int num) {
        return !(num % 2 == 0);
    }

    public boolean getNum() {
        return true;
    }

    public int getNum(int i) {
        return i++;
    }

    public int getNum(int i, String string) {
        return i--;
    }

    public void  getNum(String string, int i) {

    }

}
