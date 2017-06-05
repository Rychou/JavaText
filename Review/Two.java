package Review;

//    2、输入两个正整数m和n，求其最大公约数和最小公倍数。

import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int m = in.nextInt();
        System.out.println("请输入第二个整数");
        int n = in.nextInt();
        System.out.println("最大公约数:"+maxgongyueshu(m,n));
        System.out.println("最小公倍数:"+mingongbeishu(m,n));
    }
    public static int maxgongyueshu(int m ,int n){
        //保证 m > n
        if (m<n){
            int temp = m;
            m = n;
            n = temp;
        }
        if (m%n==0)
            return n;
        else {
            int temp =m;
            m = n;
            n = temp%n;
            return maxgongyueshu(m,n); //递归调用
        }
    }
    public static int mingongbeishu(int m,int n){
        return m*n/maxgongyueshu(m,n); //最小公倍数 = m*n / m与n的最大公约数
    }
}
