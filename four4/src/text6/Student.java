package text6;

import java.util.*;

/**
 * Created by Administrator on 2017/5/21.
 */
public class Student {
    private int sid;
    private String sname;
    private String className;
    Map scoreMap = new HashMap();
    public Student(){}
    public Student(int sid,String sname){
        this.sid = sid;
        this.sname = sname;
    }
    public Student(int sid,String sname,String className){
        this.sid = sid;
        this.sname = sname;
        this.className = className;
    }
    public String getName(){
        return sname;
    }
    public int getID(){
        return sid;
    }
    public String getClassName(){return className;}
    public void addScore(String courseName,int score){
        scoreMap.put(courseName,score);
    }
    public void modifyScore(String courseName,int score){
        scoreMap.replace(courseName,score);
    }
    public int getScore(String courseName){
        return (int)scoreMap.get(courseName);
    }
    public HashMap getAll(){
        HashMap map = new HashMap();
        map.putAll(scoreMap);
        return map;
    }
    public double getAvgScore(){
        Set<String> key = scoreMap.keySet();
        double avgScore;
        int ttScore=0;
        for (Iterator it = key.iterator(); it.hasNext();){
            String s = (String)it.next();
            ttScore += (int)(scoreMap.get(s));
        }
        return (double)ttScore/key.size();
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,"a","class1");
        s1.addScore("sql server", 90);
        s1.addScore("C++",89);
        s1.addScore("Java", 76);

        Student s2 = new Student(2,"b","class1");
        s2.addScore("sql server", 92);
        s2.addScore("C++", 88);
        s2.addScore("Java",80);

        Student s3 = new Student(3,"aa","class2");
        s3.addScore("sql server", 91);
        s3.addScore("Java", 78);

        Student s4 = new Student(4,"bb","class2");
        s4.addScore("C++", 60);
        s4.addScore("Java", 56);


        List<Student> aList = new ArrayList<Student>();
        aList.add(s1);
        aList.add(s2);
        aList.add(s3);
        aList.add(s4);


        //class1 的人数
        int c1 = 0;
        //class2 的人数
        int c2 = 0;
        //class1 的学生的平均分总和
        double avgNumc1 = 0;
        //class2 的学生的平均分总和
        double avgNumc2 = 0;


        Iterator<Student> it = aList.iterator();
        while (it.hasNext()){
            Student stu = it.next();
            String clsn = stu.className;
            if (clsn =="class1") {
                c1++;
                avgNumc1 += stu.getAvgScore();
            }
            else if (clsn =="class2"){
                c2++;
                avgNumc2 += stu.getAvgScore();
            }
        }
        System.out.println("class1 的平均分:"+avgNumc1/c1);
        System.out.println("class2 的平均分:"+avgNumc2/c2);

    }
}
