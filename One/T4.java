package Text1;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startPosition=0,endPosition=0;
		char cStart='��',cEnd='��';
		startPosition=(int)(cStart); //cStart��int��ת�������㣬���������ֵ��startPosition
		       endPosition=(int)(cEnd); //cEnd��int��ת�����㣬���������ֵ��endPosition
		System.out.println("ϣ����ĸ��");
		for(int i=startPosition;i<=endPosition;i++)
		{
		char c='\0';
		c=(char)(i);//i��char��ת�����㣬���������ֵ��c
		       System.out.print(c+" ");//��һ�����һ���ַ�
		if(i%10==4)//ÿ10���ַ���һ��
		System.out.println(""); 
		} 
		}
		

	}


