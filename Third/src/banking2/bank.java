package banking2;

public class bank {
	private Customer[] customers;
	private int numberOfCustomers;
	public bank(){
		customers = new Customer[10];
		this.numberOfCustomers = 0;
	}
	public void addCustomer(String fistName,String lastName){
		Customer cm = new Customer(fistName, lastName);
		customers[numberOfCustomers] = cm;
		numberOfCustomers ++;
	}
	public int getNumOfCustomers(){
		return numberOfCustomers;
	}
	public Customer getCustomer(int index){
		return customers[index];
	}
}
