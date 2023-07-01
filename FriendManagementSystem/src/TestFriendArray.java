import java.util.Scanner;

public class TestFriendArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice: \n");
		int choice=0;
		do {
			System.out.println("1. add new friend\n 2. search by id \n3. search by name\n 4. display all employee\n 5.display by birth month\n 6. search by location\n 7.search mobileno using name \n  8. exit\nChoice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				FriendService.addNewFrnd();
				break;
			case 2:
				System.out.println("Enter fid: ");
				int fid=sc.nextInt();				
				Friend f=FriendService.searchById(fid);
				if(f!=null) {
					System.out.println(f);
				}else {
					System.out.println("not found");
				}
				break;
			case 3:
				  System.out.println("enter name");
				   sc.nextLine();
				   String nm=sc.nextLine();
				   int cnt=FriendService.searchByName(nm);
				   //check whether found data
				   if(cnt!=0) {
					   System.out.println(cnt+"\nNumber of Friend with name "+nm);
				   }else {
					   System.out.println("not found");
				   }  
				   
				break;
			case 4:
				FriendService.displayAll();
				break;
			case 5:
		
				  System.out.println("enter month");
				   sc.nextLine();
				   int m=sc.nextInt();
				    cnt=FriendService.displayByMonth(m);
				   //check whether found data
				   if(cnt!=0) {
					   System.out.println(cnt+"\nNumber of Friend with name "+m);
				   }else {
					   System.out.println("not found");
				   } 
				break;
			case 6:
				
				  System.out.println("enter location");
				   sc.nextLine();
				   String l=sc.nextLine();
				    cnt=FriendService.displayByLocation(l);
				   //check whether found data
				   if(cnt!=0) {
					   System.out.println(cnt+"\nNumber of Friend with name "+l);
				   }else {
					   System.out.println("not found");
				   } 
				break;
			case 7:
				  System.out.println("enter name");
				   sc.nextLine();
				   String n=sc.nextLine();
				    cnt=FriendService.displayMobileByName(n);
				   //check whether found data
				   if(cnt!=0) {
					   System.out.println(cnt+"\nNumber of Friend with name "+n);
				   }else {
					   System.out.println("not found");
				   } 
				break;
			case 8:
				sc.close();
				break;
			
			default:
				System.out.println("Wrong choice!");
			}
		}
		while(choice!=8);
		
	}

}
