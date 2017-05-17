package text4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Student {
	String name;
	String className;
	String course;
	double score;
	public Student(String name,String className,String course,double score){
		this.name = name;
		this.className = className;
		this.course = course;
		this.score = score;
	}
	public static void main(String[] args) {
		double c1Total = 0;
		int studentNum = 0;
		double JavaTotal = 0;
		double CTotal = 0;
		int JavaNum = 0;
		int CNum = 0;
		Student zs = new Student("zhangsan","class1","Java",85);
		Student zle = new Student("zhouleer","class1","C#",78);
		Student wt = new Student("wangtao","class2","C#",52);
		Student lm = new Student("liming","class2","Java",48);
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(zs);
		student.add(zle);
		student.add(wt);
		student.add(lm);
		for(int i=0;i<student.size();i++){
			if(student.get(i).className == "class1"){
				c1Total += student.get(i).score;
				studentNum++;
			}
		}
		for(int i=0;i<student.size();i++){
			if(student.get(i).course == "Java"){
				JavaTotal += student.get(i).score;
				JavaNum++;
			}
			else if(student.get(i).course == "C#"){
				CTotal += student.get(i).score;
				CNum++;
			}
		}
		System.out.println("class1's total score is "+c1Total );
		System.out.println("The average score is "+ c1Total/studentNum);
		System.out.println("The average score of Java is "+JavaTotal/JavaNum);
		System.out.println("The average score of C# is "+CTotal/CNum);
	}

}
