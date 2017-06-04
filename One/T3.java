package Text1;

import java.util.Scanner;

public class T3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个四位数");
		int num= in.nextInt();
		int a,b,c,d;  //分别取得个十百千位数
		a=num%10;
		b=num/10%10;
		c=num/100%10;
		d=num/1000%10;
		System.out.print(d+" "+c+" "+b+" "+a);
}
}