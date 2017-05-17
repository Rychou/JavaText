package text6;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	int num;
	String name;
	int age;
	public Student(int num,String name,int age){
		this.num = num;
		this.name = name;
		this.age = age;
	
	}
	public boolean equals(Object o){
		Student other = (Student)o;
//		if(this==o)
//			return true; 
		 if(this.name == other.name && this.age == other.age)
			return true;
		else
			return false;
	}
	public static void main(String[] arg){
		Student s1 = new Student(1,"Tom",20);
		Student s2 = new Student(2,"Jack",21);
		Student s3 = new Student(3,"John",22);
		Student s4 = new Student(4,"Tom",20);
		Student s5 = new Student(5,"John",22);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i).equals(list.get(j))){
					list.remove(j);
				}
			}
		}
		for(int i=0;i<list.size();i++){
			System.out.println("sid:"+list.get(i).num+" name:"+list.get(i).name+" age:"+list.get(i).age);
		}
	}
}
