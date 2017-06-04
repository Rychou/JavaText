package Text1;

public class T8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1000;// 总共能喝的汽水瓶数
		int vain=1000; //空瓶子数
		while(vain>3){
			vain-=3;
			num+=1;
			vain+=1;
		}
		System.out.println("你喝了"+num+"瓶汽水"+" 还有"+vain+"个空瓶子");
	}

}
