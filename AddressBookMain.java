import java.util.Scanner;

public class AddressBookMain {
	Scanner sc=new Scanner(System.in);
	static Contact[] contacts=new Contact[10];
	int add(int i)
	{
		System.out.println("Enter First Name:");
		String FN=sc.next();
		System.out.println("Enter last name:");
		String LN=sc.next();
		System.out.println("Enter Address:");
		String ADD=sc.next();
		System.out.println("Enter City:");
		String City=sc.next();
		System.out.println("Enter State:");
		String State=sc.next();
		System.out.println("Enter phone number:");
		String PN=sc.next();
		System.out.println("Enter email");
		String Email=sc.next();
		contacts[i++]=new Contact(FN, LN, ADD, City, State, PN, Email);
		return i;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Systemm Program !!!!");
		AddressBookMain abm=new AddressBookMain();
	}

}
