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
	
	void edit(int i)
	{
		int temp;
		for(temp=0;temp<10;temp++)
		{
			if(temp==i)
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
				contacts[i]=new Contact(FN, LN, ADD, City, State, PN, Email);
				break;
			}
		}
		System.out.println("Editied Sucessfully...");
	}
	
	void delete(int i)
	{
		int temp;
		for(temp=0;temp<10;temp++)
		{
			if(temp==i)
			{
				contacts[i]=null;
				break;
			}
		}
		System.out.println("deleted Sucessfully...");
	}



	void display()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" "+contacts[i]);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to Address Book Systemm Program !!!!");
		AddressBookMain abm=new AddressBookMain();

		String ans="Y";
		int i=0;
		do
		{
			System.out.println("1.Add 2.Edit 3.Delete");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
				i=abm.add(i);
				abm.display();
				break;
				case 2:
				System.out.println("Enter record number you want to edit:");
				int j=s.nextInt();
				abm.edit(j);
				abm.display();
				break;
				case 3:
				System.out.println("Enter record number you want to delete:");
				int k=s.nextInt();
				abm.delete(k);
				abm.display();
				break;
			}
			System.out.println("Enter choice(Y/N):");
			ans=s.next();
		}while(ans!="N");
	}

}
