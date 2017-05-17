package text3;

public class Fish extends Animal implements Pet {
	public String Name;
	protected Fish() {
		super(0);
	}
	public String getName(){
		return Name;
	}
	public void setName(String name){
		this.Name = name;
	}
	public void play(){
		System.out.println("Fish playing!");
	}
	public void walk(){
		System.out.println("Fish have not legs,coundn't walk!");
	}
	void eat() {
		System.out.println("Fish eating!");
	}
	
}
