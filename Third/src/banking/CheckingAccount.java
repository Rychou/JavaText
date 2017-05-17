package banking;

public class CheckingAccount extends Account{
	public double overdraftProtection;
	public CheckingAccount(double balance){
		super(balance);
	}
	public CheckingAccount(double balance,double protect){
		super(balance);
		overdraftProtection = protect;
	}
	public boolean withdraw(double amt){
		if( amt<balance){
			balance -= amt;
			return true;
		}
		else if(overdraftProtection<0 || amt > (overdraftProtection+balance)){
			return false;
		}
		else{
			balance = 0;
			overdraftProtection = overdraftProtection + balance -amt;
			return true;
		}
	}
}
