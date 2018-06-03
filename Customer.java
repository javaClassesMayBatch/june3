package june3;

public class Customer {
	
	private int id;
	private int balance;
	private String name;
	private int pin;
	
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getPin() {
		return this.pin;
	}
	
	public Customer() {
		System.out.println("0 param");
		//0 param - constructor
		id = 0;
		name = "";
		balance = 0;
	}
	/*public Customer(int id) {
		System.out.println("1 param id");
		//1 param - constructor
		this.id = id;
		name = "";
		balance = 0;
	}
	public Customer(String name) {
		System.out.println("1 param name");
		//1 param - constructor
		id = 0;
		this.name = name;
		balance = 0;
	}
	public Customer(int id, String name) {
		System.out.println("2 param id, name");
		//2 param - constructor
		this.id = id;
		this.name = name;
		balance = 0;
	}
	public Customer(int id, int balance) {
		System.out.println("2 param id, balance");
		//2 param - constructor
		this.id = id;
		name = "";
		this.balance = balance;
	}
	public Customer(int id, int balance, String name) {
		System.out.println("3 param id, balance, name");
		//3 param - constructor
		this.id = id;
		this.name = name;
		this.balance = balance;
	}*/
	
	public Customer(int id, int pin, int balance, String name) {
		this.id = id;
		this.pin = pin;
		this.balance = balance;
		this.name = name;
	}
	
	public void printCustomerDetails(){
		System.out.println("id is: "+this.id);
		System.out.println("name is: "+this.name);
		System.out.println("balance is: "+this.balance);
		System.out.println();
	}
	
	public void withdraw() {
		this.balance -= 2;
		System.out.println(" 2 ruppes are deducted form your balance.");
	}
	
	public void withdraw(int pin, int amountToWithdraw) {
		if(pin == this.pin) {
			if(amountToWithdraw < this.balance ) {
				this.balance -= amountToWithdraw;
				System.out.println("Success");
			}else {
				System.out.println("Insufficient Balance");
			}
		}else {
			System.out.println("Wrong Pin");
		}
	}
	
	public void addAmount(Customer user) {
		user.balance += 100;
		System.out.println(user.balance);
	}
	
	public void addAmount(int balance, int amount) {
		balance += amount ;
		System.out.println(balance);
	}
	
}
