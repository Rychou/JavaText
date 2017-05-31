package text4;

import java.util.TreeSet;

public class Person implements Comparable<Person> {
	private int age;
	private String name;
	public Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int compareTo(Person p){
		if ((this.getAge()==p.getAge())&&(this.getName()==p.getName()))
			return 0;
		else if ((this.getAge()-p.getAge())>0)
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<Person>();
		Person p1 = new Person(19, "kb0");
		Person p2 = new Person(24, "tomers");
		Person p3 = new Person(21, "omers");
		Person p4 = new Person(22, "tos");
		Person p5 = new Person(21, "mers");
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		for (Person p : set) {
			System.out.println(p.getAge() + " " + p.getName());
		}
	}
}
