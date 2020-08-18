package main.algorithm.sort;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class popSort {
    public static void doWrite(){
        BufferedWriter bw = null;
        Map<String, String> map = new HashMap();
        map.put("adf", "slll");
        try {
            File file = new File("tmp.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            bw = new BufferedWriter(new FileWriter(file));
            StringBuffer sb = new StringBuffer();
            sb.append("a \n");
            if (null != map.get("a")) {
                sb.append("jsdflka");
            }
            sb.append("1111111" +"\n");
            sb.append("b \n");
            bw.write(sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
