package Text1;

public class T9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,0,2,1};
		if(arr[0]==arr[4]){
			if(arr[1]==arr[3])
				System.out.println("对称数组");
			else
				System.out.println("不对称");
		}
		else
			System.out.println("不对称");
	}

}
