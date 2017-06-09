package Review;

import java.io.*;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Eleven {
    public static void main(String[] args){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new FileWriter(".\\src\\Review\\eleven.txt",true));
            String line = null;
            int num =1;
            while ((line = br.readLine())!=null){
                if ("Done".equals(line))
                    break;
                bw.write(num +":"+line);
                bw.newLine();
                bw.flush();
                num++;
            }
            br.close();
            bw.close();
        }
        catch (IOException e){
            throw new RuntimeException("写入失败");
        }
    }
}
