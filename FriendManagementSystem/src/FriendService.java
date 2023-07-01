import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
//import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class FriendService {
	private static Friend frndarr[];
	private static int cnt;
	static {
		frndarr=new Friend[50];
	
		frndarr[0]=new Friend(1,"sainya","5555","sainya@gmail.com","kanpur",new Date());
		frndarr[1]=new Friend(2,"arjun","4444","arjun@gmail.com","nanded",new Date());
		frndarr[2]=new Friend(3,"saket","3233","saket@gmail.com","chhindwara",new Date());
		cnt=3;
	}
	
	public static void addNewFrnd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int fid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Mobile: ");
		String m=sc.nextLine();
		System.out.println("Enter Email: ");
		String mail=sc.nextLine();
		System.out.println("Enter Address: ");
		String add=sc.nextLine();
		System.out.println("Enter DOB in (dd/mm/yyyy): ");
		String bdate=sc.next();
		SimpleDateFormat sdt=new SimpleDateFormat("dd/MM/yyyy");
		Date dt=null;
		
		try {
			dt=sdt.parse(bdate);
		 	}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
//		String hobby=sc.nextLine();
//		System.out.println("Enter Hobbies: ");
//		for(int i=0;i<3;i++) {
//			frndarr[i].getHobby()[i]=sc.next();
//		}
		
//		frndarr[cnt]=new Friend(fid,name,m,mail,add,dt,hobby);
		cnt++;
	}

	public static void displayAll() {
		// TODO Auto-generated method stub
		for(int i=0;i<cnt;i++) {
			System.out.println(frndarr[i]);
		}
	}

	public static Friend searchById(int v) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<cnt;i++) {
			if(frndarr[i].getFid()==v) 
			return frndarr[i];	
		}
		return null;
	}

	public static int searchByName(String fname) {
		// TODO Auto-generated method stub
		int cnt1=0;
		for(int i=0;i<cnt;i++) {
			if(frndarr[i].getFname().equals(fname)) {
				System.out.println(frndarr[i]);
				cnt1++;		
			}
		}
		
		return cnt1;
}

	public static int displayByMonth(int m) {
		// TODO Auto-generated method stub
		int cnt1=0;
		for(int i=0;i<cnt;i++) {
			int mon=frndarr[i].getDob().getMonth();
			if(mon==(m-1)) {
				System.out.println(frndarr[i]);
				cnt1++;
			}
		}
		return cnt1;
	}

	public static int displayByLocation(String l) {
		// TODO Auto-generated method stub
		int cnt1=0;
		for(int i=0;i<cnt;i++) {
			String loc=frndarr[i].getAdd();
			if(loc.equals(l)) {
				System.out.println(frndarr[i]);
				cnt1++;
			}
		}
		return cnt1;
}

	public static int displayMobileByName(String n) {
		// TODO Auto-generated method stub
		int cnt1=0;
		for(int i=0;i<cnt;i++) {
			String m=frndarr[i].getFname();
			
			if(m.equals(n)) {
				System.out.println(frndarr[i].getMobile());
				cnt1++;
			}
		}
		return cnt1;
}
	

}
