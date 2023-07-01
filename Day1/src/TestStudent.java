import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. Add new student \n2. Display all \n3. Search By id \n4. Search By name \n5. Calculate GPA of student  \n6. Exit");
			System.out.println("Enter choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				StudentService.addNewStudent();
				break;
			case 2:
//				System.out.println("_____________________");
				System.out.println("Student Details");
				System.out.println("_____________________");
				StudentService.displayAll();
				break;
			case 3:
				
				System.out.println("Enter id : ");
				int n=sc.nextInt();
				Student s=StudentService.searchById(n);
				if(s!=null) {
					System.out.println("_____________________");
					System.out.println(s);
					System.out.println("_____________________");
				}else {
					
					System.out.println("not found");
				}
				break;
			case 4:
				sc.nextLine();
				System.out.println("Enter Name : ");
				String nm=sc.nextLine();
				System.out.println(nm);
				Student ss=StudentService.searchByName(nm);
				if(ss!=null) {
					System.out.println("_____________________");
					System.out.println(ss);
					System.out.println("_____________________");
				}else {
					
					System.out.println("not found");
				}
				break;
			case 5:
				System.out.println("Enter id : ");
				int id=sc.nextInt();
				StudentService.calculateGPA(id);

				break;
			case 6:
				System.out.println("Thankyou for visiting...");
				sc.close();
				break;
			default:
				System.out.println("Wrong choice!");
			}
		}while(choice!=6);
		
	}

}
