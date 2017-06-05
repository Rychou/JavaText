package Review.Seven;

/**
 * Created by Administrator on 2017/6/5.
 */
public class Cat extends Animal implements Pet {
    private String name;
    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this("");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void play(){
        System.out.println(name+" playing!!!");
    }
    public void eat(){
        System.out.println(name+" eating!!!");
    }
}
