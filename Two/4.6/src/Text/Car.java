package Text;

public class Car {
	private String license;
	private int speed;
	private double weight;
	public Car(){
		license = "XX1234";
		speed = 100;
		weight = 100;
	}
	public Car(String license , int speed, double weight){
		this.license = license;
		this.speed = speed;
		this.weight = weight;
	}
	public void speedUp(int speed){
		this.speed +=speed;
	}
	public void speedDown(int speed){
		this.speed -= speed;
	}
	public void changeLicense(String license){
		this.license = license;
	}
	public void showWeight(){
		System.out.println(weight);
	}
	public static void main(String[] args) {
		Car one = new Car();
		Car two = new Car("¡…B5086",150,200);
		one.changeLicense("¡…A9752");
		one.speedUp(20);
		two.speedDown(20);
		System.out.println("license="+one.license+" speed="+one.speed+" weight="+one.weight);
		System.out.println("license="+two.license+" speed="+two.speed+" weight="+two.weight);
	}

}
