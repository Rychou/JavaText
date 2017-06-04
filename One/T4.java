package Text1;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startPosition=0,endPosition=0;
		char cStart='α',cEnd='ω';
		startPosition=(int)(cStart); //cStart做int型转换据运算，并将结果赋值给startPosition
		       endPosition=(int)(cEnd); //cEnd做int型转换运算，并将结果赋值给endPosition
		System.out.println("希腊字母表：");
		for(int i=startPosition;i<=endPosition;i++)
		{
		char c='\0';
		c=(char)(i);//i做char型转换运算，并将结果赋值给c
		       System.out.print(c+" ");//空一格输出一个字符
		if(i%10==4)//每10个字符换一行
		System.out.println(""); 
		} 
		}
		

	}


