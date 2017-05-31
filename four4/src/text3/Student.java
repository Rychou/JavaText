package text3;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private String name;
	private String cls;
	private String course;
	private int score;
	public Student(String name,String cls,String course,int score){
		this.name = name;
		this.cls = cls;
		this.course = course;
		this.score = score;
	}
	public boolean equals(Object o){
		Student other = (Student)o;
		if(this.name == other.name&&this.cls==other.cls&&this.course==other.course&&this.score==other.score)
			return true;
		else
			return false;
	}
	public int hashCode(){
			return 1;
	}
	public static void main(String[] args) {
		Student s1 = new Student("����","class1","Java",85);
		Student s2 = new Student("���ֶ�","class1","C#",79);
		Student s3 = new Student("����","class2","C#",52);
		Student s4 = new Student("����","class2","Java",48);
		Student s5 = new Student("����","class2","Java",48);
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		if(set.size()==4)
			System.out.println("���벻�ɹ�");
		System.out.println(set.toString());
	}

}

