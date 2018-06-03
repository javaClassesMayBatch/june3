package june3;

import java.util.Scanner;

public class TernaryOperator {
	
	int pin;
	int balance;
	boolean isPinCorrect;
	
	public TernaryOperator(int pin, int balance) {
		this.pin = pin;
		this.balance = balance;
	}

	public static void main(String a[]) {
		TernaryOperator tr = new TernaryOperator(1987,100000);
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		int amountToWithdraw = sc.nextInt();
		System.out.println(
				(pin == tr.pin) 
				? (
						(amountToWithdraw < tr.balance ) ? "OK" : "Bouncer"
				) : 
						"Sorry"
		);

		
		
		/*if(tr.pin == pin) {
			System.out.println("Ok");
		}else {
			System.out.println("Sorry");
		}*/
		//tr.isPinCorrect = (tr.pin == pin);
		
		//String message = tr.isPinCorrect ? "Ok" : "Sorry";
		
		//String message = (pin == tr.pin) ? "Ok" : "Sorry";
		
		
	}
	
}
