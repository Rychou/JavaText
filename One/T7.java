package Text1;

public class T7 {

	public static void main(String[] args) {
		int i,j,k;
//		int malec; //¹«¼¦
//		int femalec; //Ä¸¼¦
//		int littlec; //Ð¡¼¦
		for(i=1;i<=20;i++)
			for(j=1;j<=33;j++)
				for(k=3;k<=300;k+=3){
					if((i*5+j*3+k/3)==100&&(i+j+k)==100){
						System.out.println("¹«¼¦:"+i+" Ä¸¼¦"+j+" Ð¡¼¦"+k);
					}
				}
	}

}
