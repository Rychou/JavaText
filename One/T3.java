package Text1;

import java.util.Scanner;

public class T3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int num= in.nextInt();
		int a,b,c,d;  //�ֱ�ȡ�ø�ʮ��ǧλ��
		a=num%10;
		b=num/10%10;
		c=num/100%10;
		d=num/1000%10;
		System.out.print(d+" "+c+" "+b+" "+a);
}
}