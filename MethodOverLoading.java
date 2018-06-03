package june3;

public class MethodOverLoading {
	public static void main(String a[]) {
		Customer shubham = new Customer(21, 1234, 5, "Shubham Singh");
		System.out.println(shubham.getBalance());
		shubham.withdraw();
		System.out.println(shubham.getBalance());
		shubham.withdraw(1212, 1);
		System.out.println(shubham.getBalance());
		shubham.withdraw(1234, 10);
		System.out.println(shubham.getBalance());
		shubham.withdraw(1234, 1);
		System.out.println(shubham.getBalance());
		
	}
}
