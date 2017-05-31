package text8;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Text {
    public  static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        try{
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            sanjiao(a,b,c);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
    static void sanjiao(int a, int b, int c) throws IllegalArgumentException {
        if (!((a+b)>c)&&((a+c)>b)&&((c+b)>a))
            throw new IllegalArgumentException("a,b,c不能构成三角形");
        else System.out.println("三边长分别为:"+a+b+c);
    }
}
