package Review.Seven;

/**
 * Created by Administrator on 2017/6/5.
 */
public class TestAnimals {
    public static void main(String[] args){
        Cat c = new Cat("Tom");
        Animal a = new Spider();
        Pet p = new Cat();
        c.eat();
        c.play();
        c.walk();
        System.out.println(c.getName());
        c.setName("Kim");
        System.out.println(c.getName());
        a.eat();
        a.walk();
        p.play();
        p.setName("SC");
        p.play();
        System.out.println(p.getName());
    }
}
