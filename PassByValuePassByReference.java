package june3;

import java.util.Scanner;

public class PassByValuePassByReference {
	
	public static void main(String a[]) {
		Customer shubham = new Customer(21, 1234, 5, "Shubham Singh");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		
		shubham.addAmount(shubham.getBalance(), amount);
		System.out.println(shubham.getBalance());
		
		shubham.addAmount(shubham);
		System.out.println(shubham.getBalance());
		
	}
	
}
