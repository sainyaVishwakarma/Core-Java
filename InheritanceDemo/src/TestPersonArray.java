import java.util.Scanner;

public class TestPersonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Add new person \n2. Display all \n3. Calculate percentage marksn \n4. Calculate grade \n5. Exit");
			System.out.println("Enter choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				PersonService.addPerson();
				break;
			case 2:
				PersonService.displayAll();
				break;
			case 5:
				System.out.println("Thank you for visiting");
				sc.close();
				break;
			default:
				System.out.println("Wrong choice");
			}
		}while(choice!=5);
	}

}
