package Text;

public class Student 	{
	private int sNO; // 学号
	private String sName; //姓名
	private String sSex;  //性别
	private int sAge; // 年龄
	private double sJava; // java成绩
	public Student(int num,String name,String sex,int age,double java){
		sNO = num;
		sName = name;
		sSex = sex;
		sAge = age;
		sJava = java;
	}
	public int getNo(){
		return sNO;
	}
	public String getName(){
		return sName;
	}
	public String getSex(){
		return sSex;
	}
	public int getAge(){
		return sAge;
	}
	public double getJava(){
		return sJava;
	}
	
	public static void main(String[] args) {
		Student Tom = new Student(1,"Tom","male",18,85);
		Student Simons = new Student(2,"Simons","male",18,75);
		Student Jane = new Student(3,"Jane","female",18,98);
		Student Dean = new Student(4,"Dean","male",18,80);
		Student Bryent = new Student(5,"Bryent","male",18,61);
		System.out.println("Tom:");
		System.out.println("num="+Tom.sNO+" name="+Tom.sName+" sex="+Tom.sSex+" age="+Tom.sAge+" java="+Tom.sJava);
		System.out.println("Simons:");
		System.out.println("num="+Simons.sNO+" name="+Simons.sName+" sex="+Simons.sSex+" age="+Simons.sAge+" java="+Simons.sJava);
		System.out.println("Jane:");
		System.out.println("num="+Jane.sNO+" name="+Jane.sName+" sex="+Jane.sSex+" age="+Jane.sAge+" java="+Jane.sJava);
		System.out.println("Dean:"); 
		System.out.println("num="+Dean.sNO+" name="+Dean.sName+" sex="+Dean.sSex+" age="+Dean.sAge+" java="+Dean.sJava);
		System.out.println("Bryent:");
		System.out.println("num="+Bryent.sNO+" name="+Bryent.sName+" sex="+Bryent.sSex+" age="+Bryent.sAge+" java="+Bryent.sJava);
	
//		aver = (Tom.sJava+Simons.sJava+Jane.sJava+Dean.sJava+Bryent.sJava)/5;
//		System.out.println("平均成绩:"+aver);
		double Java[] = {Tom.sJava,Simons.sJava,Jane.sJava,Dean.sJava,Bryent.sJava};
		double aver;
		double sum=0;
		int i;
		for(i=0;i<5;i++){
			sum += Java[i];
		}
		aver = sum/5;
		System.out.println(aver);
		double max=Java[0],min=Java[0];
		for(i=0;i<5;i++){
//			max = Java[i];
//			min = Java[i];
			if(max<Java[i])
				max = Java[i];
			else if(min>Java[i])
				min = Java[i];
			
		}
		System.out.println("max="+max+" min="+min);
		
	}
}


