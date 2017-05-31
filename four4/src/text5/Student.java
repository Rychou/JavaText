package text5;

import java.util.*;

public class Student {
    private int sid;
    private String sname;
    Map scoreMap = new HashMap();
    public Student(){}
    public Student(int sid,String sname){
        this.sid = sid;
        this.sname = sname;
    }
    public String getName(){
        return sname;
    }
    public int getID(){
        return sid;
    }
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
        for (Iterator it = key.iterator();it.hasNext();){
            String s = (String)it.next();
            ttScore += (int)scoreMap.get(s);
        }
        return ttScore/key.size();
    }
    //重写toString方法
    @Override
    public String toString(){
        return "id:"+sid+" "+sname+"的选课情况:"+scoreMap.toString()+"平均分:"+getAvgScore();
    }
    public static void main(String[] args){
        Student s1 = new Student(1,"Tom");
        Student s2 = new Student(2,"Jack");
        s1.scoreMap.put("Java",89);
        s1.scoreMap.put("C++",70);
        s1.scoreMap.put("SQL",92);
        s2.scoreMap.put("Java",78);
        s2.scoreMap.put("C++",60);
        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        s1.modifyScore("SQL",95);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }

}
