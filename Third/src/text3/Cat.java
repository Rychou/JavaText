package text3;

public class Cat extends Animal implements Pet {
	public String Name;
	public Cat(String Name){
		super(4);
		this.Name = Name;
	}
	public Cat(){
		this("");
	}
	public String getName() {
		return Name;
	}

	public void play() {
		System.out.println("Cat playing!");
	}

	public void setName(String name) {
		Name = name;
	}
	public void eat(){
		System.out.println("Cat eating!");
	}
}
