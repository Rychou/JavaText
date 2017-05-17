package text5;

public class worker {
	public int num;
	public String name;
	public String depName;
	public int salary;
	public worker(int num,String name,String depName,int salary){
		this.num = num;
		this.name = name;
		this.depName = depName;
		this.salary = salary;
	}
	public void changePay(int salary){
		this.salary = salary;
	}
	public void changePay(double rate){
		salary = (int) (salary*(1+rate));
	}
}
