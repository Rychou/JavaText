package Review;

/*
编程创建一个Person类，在其中包括属性（姓名，性别，年龄）和方法getDetails()，
用于显示所有信息。将Person类作为父类，创建子类Student，增加属性“专业”，重写getDetails()方法
，在该方法中使用父类的getDetails()方法，用下面的测试代码。
	public static void main(String args[]){
	Student s=new Student("庄敏","女",20,"软件技术");
	System.out.println(s.getDetails());
	}
       最后显示：“姓名：庄敏，性别：女，年龄：20岁，专业：软件技术”

 */
class Person{
    String name;
    String sex;
    int age;
    public Person(String name,String sex,int age){
        this.name =name;
        this.sex =sex;
        this.age =age;
    }
    public String getDetails(){
        return ("姓名:"+name +" 性别:"+sex+" 年龄:"+age);
    }
}
class Student extends Person{
    String major;
    public Student(String name,String sex,int age,String major){
        super(name,sex,age);
        this.major = major;
    }
    public String getDetails(){
        return ("姓名:"+name +" 性别:"+sex+" 年龄:"+age+" 专业:"+major);
    }
}
public class Six {
    public static void main(String[] args){
        Student s=new Student("庄敏","女",20,"软件技术");
        System.out.println(s.getDetails());
    }
}