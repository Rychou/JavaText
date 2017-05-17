package text3;

public class TestAnimals {
	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
//		Fish:
		d.setName("sily");
		System.out.println("fish'name:"+d.getName());
		d.play();
		d.walk();
		d.eat();
//		Cat
		System.out.println("Cat'Name:"+c.getName());
		c.setName("fluffy");
		System.out.println("Cat'Name:"+c.getName());
		c.play();
		c.eat();
//		Animal a
		a.eat();
		a.walk();
		System.out.println("legs:"+a.legs);
//		Animal e
		e.eat();
		e.walk();
//		Pet p
		p.setName("littleCat");
		System.out.println("Name:"+p.getName());
		p.play();
	}

}
