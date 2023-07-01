import java.util.Scanner;

public class StudentService {
	static Student[] stuarr;
	static int cnt;
	static {
		cnt=0;
		stuarr=new Student[2];
	}
	
	public static void addNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter studid : ");
		int sid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter studname : ");
		String sname=sc.nextLine();
		System.out.println("Enter m1 : ");
		int m1=sc.nextInt();
		System.out.println("Enter m2 : ");
		int m2=sc.nextInt();
		System.out.println("Enter m3 : ");
		int m3=sc.nextInt();
		stuarr[cnt]=new Student(sid,sname,m1,m2,m3);
		cnt++;
	}
	
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(stuarr[i] );
			
			System.out.println("_____________________");
			
		}
	}

	public static Student searchById(int n) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<cnt;i++) {
			if(stuarr[i].getStudid()==n) {
				return stuarr[i];
			}
			
		}
		return null;
	}

	public static Student searchByName(String nm) {
		// TODO Auto-generated method stub
		for(int i=0;i<cnt;i++) {
			if(stuarr[i].getName().equals(nm)) {
				return stuarr[i];
			}
		}
		return null;
	}

	public static void calculateGPA(int n) {
		// TODO Auto-generated method stub
		Student t=searchById(n);
		
			
				float GPA=(float)((0.34)*(t.getM1())+(0.5)*(t.getM2())+(0.25)*(t.getM3()));
//				return GPA;
				if(GPA!=0) {
					System.out.println("_____________________");
					System.out.println("GPA of student : "+GPA);
					System.out.println("_____________________");
				}else {
					
					System.out.println("not found");
				}
		
	
	}
}
