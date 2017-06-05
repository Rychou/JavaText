package Review;

import java.util.ArrayList;
import java.util.Iterator;

/*
    定义一个学生类（Student），属性包括：学号，姓名，班号，课程名，成绩；方法包括：获得班号getClass()
    课程号getCourse()，获得成绩getScore()，以及一个toString()方法将Student类中的所有属性组合成一个字符串”
    学号：xxx，姓名：xxx，课程号：xxx，成绩：xxx”。
    在main函数中定义一个学生集合（用ArrayList保存），要求：统计课程“C++”的平均分。

  */
class student{
    int id;
    String name;
    String clsNum;
    String courseName;
    int score;
    public student(int id,String name,String clsNum,String courseName,int score){
        this.id =id;
        this.name = name;
        this.clsNum = clsNum;
        this.courseName = courseName;
        this.score =score;
    }
    public String getClsNum(){return clsNum;}
    public String getCourseName(){return courseName;}
    public int getScore(){return score;}
    public String toString(){
        return "学号："+id+",姓名："+name+",课程名:"+courseName+",成绩："+score;
    }

}
public class Eight {
    public static void main(String[] args){
        ArrayList<student> list = new ArrayList<student>();
        student s1 =new student(1,"tom","class1","C++",88);
        student s2 =new student(2,"tom2","class1","Java",25);
        student s3 =new student(3,"tom3","class2","C++",59);
        student s4 =new student(4,"tom4","class2","Java",95);
        student s5 =new student(5,"tom5","class1","C++",80);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        int counter=0;
        double sum=0;
        Iterator<student> it = list.iterator();
        while (it.hasNext()){
                student s = it.next();
                System.out.println(s.toString());
                if (s.courseName.equals("C++")){
                    counter++;
                    sum += s.getScore();
                }
        }
        double avg = sum/(double)counter;
        System.out.println("C++平均成绩："+avg);
    }

}
