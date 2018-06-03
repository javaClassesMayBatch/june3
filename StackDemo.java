package june3;

public class StackDemo {
	public void method1() {
		System.out.println("Entered method 1");
		method2();
		System.out.println("Leaving method 1");
	}
	public void method2() {
		System.out.println("Entered method 2");
		method3();
		System.out.println("Leaving method 2");
	}
	public void method3() {
		System.out.println("Entered method 3");
		method4();
		System.out.println("Leaving method 3");
	}
	public void method4() {
		System.out.println("Entered method 4");
		method5();
		System.out.println("Leaving method 4");
	}
	public void method5() {
		System.out.println("Entered method 5");
		System.out.println("Leaving method 5");
	}
	
	public static void main(String a[]) {
		StackDemo sd = new StackDemo();
		sd.method1();
	}

}
