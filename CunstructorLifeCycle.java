package june3;

public class CunstructorLifeCycle {
	public static void main(String args[]) {
		Customer cust1 = new Customer();

		System.out.println("cust1 details before initialization are: ");
		cust1.printCustomerDetails();
		
		/*cust1.balance =400;
		cust1.id =31;
		cust1.name="arun";*/
		System.out.println("cust1 details after  initialization are: ");
		cust1.printCustomerDetails();
		
		/*Customer cust2 = new Customer(2);
		System.out.println("cust2 details are: ");
		cust2.printCustomerDetails();
		
		Customer cust3 = new Customer("shubham");
		System.out.println("cust3 details are: ");
		cust3.printCustomerDetails();
		
		Customer cust4 = new Customer(22, 300);
		System.out.println("cust4 details are: ");
		cust4.printCustomerDetails();

		Customer cust5 = new Customer(23, "ritesh");
		System.out.println("cust5 details are: ");
		cust5.printCustomerDetails();

		Customer cust6 = new Customer(25, 400, "sagar");
		System.out.println("cust6 details are: ");
		cust6.printCustomerDetails();
*/		
		
	}
}
