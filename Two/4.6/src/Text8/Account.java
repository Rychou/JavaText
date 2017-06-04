package Text8;

import java.util.Date;
public class Account {
	private int id ;
	private double balance;
	private double annualRate ;
//	private Date dateCreated;
	Date dateCreated = new Date();
	public Account(){
		id = 0;
		balance = 0;
		annualRate = 0;
	}
	public Account(int id,double balance,double annualRate){
		this.id = id;
		this.balance = balance;
		this.annualRate =annualRate;
	}
	public void changeId(int id){
		this.id = id;
	}
	public void changeBanlance(double balance){
		this.balance = balance;
	}
	public void changeAnnualRate(double annualRate){
		this.annualRate = annualRate;
	}
	public int getId(){
		return id;
	}
	public double balance(){
		return balance;
		
	}
	public double annualRate(){
		return annualRate;
	}
	public String getDateCreated(){
		return dateCreated.toString(); 
	}
	public double getMOnthlyRate(){
		return annualRate/12;
	}
	public void withDraw(double money){
		if(balance>=money){
			balance -= money;
			
		}
			
		else System.out.println("取款数目超出余额");
	}
	public void deposit(double money){
		balance += money;
	}
	public static void main(String[] args) {
		Account account = new Account(1122,20000,0.045);
		account.withDraw(2500);
		account.deposit(3000);
		System.out.println("balance = "+account.balance+" monthlyRate = "+account.getMOnthlyRate()+" Date = "+account.getDateCreated());
	}

}
