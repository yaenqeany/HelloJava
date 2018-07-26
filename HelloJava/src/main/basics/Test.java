package main.basics;

/**
 * Created by asus1 on 2017-03-18.
 */
public class Test {
    public static void main(String[] args) {
//        Const con = new Const("sdfkl");
        /*StringOperator stringOperator = new StringOperator();
        int[] result = stringOperator.exchangeStringToIntArray("abcGDK&**");
        System.out.println(Arrays.toString(result));
        float f = 3.4f;
        float f1 = (float) 3.14;

        short s = 1;
        short s1 = (short) (s+1);

        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

        stringOperator.hashCode();*/

        int a = 1;
        int b = a;
        a = 3;
        System.out.println("int a = "+ a );
        System.out.println("int b = "+ b );

        String s1 = "abc";
        String s2 = s1;
        s1 = "111";
        System.out.println("string s1 = " + s1);
        System.out.println("string s2 = " + s2);

        String s3 = new String("ssss");
        String s4 = new String(s3);
        s3 = "vvvv";
        System.out.println("string s3 = " + s3);
        System.out.println("string s4 = " + s4);
    }
}
