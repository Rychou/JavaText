package Text1;

import java.util.Scanner;

public class T10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		int arr[] = new int[10];
		if(num==0){
			System.out.println(num);
			
		}
		else{while(num>0){
			arr[num%10]++;
			num/=10;
		}
		int b=0;
		int k=0;
		for(int i=0;i<=9;i++){
			
			if(arr[i]>=b){
				b=arr[i];
				k=i;
			}
		}
		
		System.out.println(k);
		}
	}

}
