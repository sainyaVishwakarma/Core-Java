import java.util.Scanner;

public class PersonService {
	private static int cnt;
	private static Person[] perarr;
	static {
		cnt=0;
		perarr=new Person[20];
	}
	public static void addPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pid: ");
		String pid=sc.next();
		System.out.println("Enter pname: ");
		String pname=sc.next();
		System.out.println("Enter mobile: ");
		String mobile=sc.next();
		perarr[cnt]= new Person("p",pid,pname,mobile);
	}
	public static void displayAll() {
		// TODO Auto-generated method stub
		for(int i=0;i<perarr.length;i++) {
			System.out.println(perarr[i]);
		}
	}
}
