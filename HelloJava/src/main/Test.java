package main;//import basics.Const;

import main.basics.number.PaintDemo;
import main.basics.number.numDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Test {
    int anInt = 0;

    public static void main(String[] args) {



        /*boolean result= numDemo.isOdd(-9);
        System.out.println(result);

        BigDecimal bigDecimal1 = new BigDecimal(2.0);
        BigDecimal bigDecimal2 = new BigDecimal(1.999);

        System.out.println(BigDecimal.ROUND_CEILING);

        System.out.println(bigDecimal1.subtract(bigDecimal2).floatValue());

        PaintDemo paintDemo=new PaintDemo();
        paintDemo.paintStar(10);*/

        /*Calendar calendar = Calendar.getInstance();
        calendar.getTime();
        System.out.println(calendar.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        sdf.format(new Date());
        System.out.println(sdf.format(Calendar.DATE));*/

        /*for (int i = 0; i < 10; i++) {
            if (i == 7) {
                Runtime runtime = Runtime.getRuntime();
                System.out.println(runtime.maxMemory());
                runtime.exit(1);
            }
            System.out.println(i);
        }*/

       /* ArrayList<Integer> list = new ArrayList<Integer>();vbb
        Method method = null;
        try {
            method = list.getClass().getMethod("add", Object.class);
            method.invoke(list, "Java反射机制实例。");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {            e.printStackTrace();
        }

        System.out.println(list.get(0));*/


    }

}
