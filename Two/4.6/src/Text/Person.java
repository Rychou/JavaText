package Text;

public class Person {
	private String name;
	private int age;
	private String sex;
	public Person(String name,int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void showName(){
		System.out.println(name);
	}
	public void showAge(){
		System.out.println(age);
	}
	public void showSex(){
		System.out.println(sex);
	}
}
