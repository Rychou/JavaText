package Review.ten;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Text2 {
    public static void main(String[] args){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            br = new BufferedReader(new FileReader(input));
            bw = new BufferedWriter(new FileWriter(in.nextLine()));
            String line = null;
            while ((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        }
        catch (IOException e){
            throw new RuntimeException("复制失败");
        }
        finally {
            try{
                if(br != null)
                {
                    br.close();
                }
            }
            catch(IOException e)
            {
                throw new RuntimeException("关闭读取文件失败");
            }
            try{
                if(bw != null)
                {
                    bw.close();
                }
            }
            catch(IOException e)
            {
                throw new RuntimeException("关闭写入文件失败");
            }
        }
    }
}
