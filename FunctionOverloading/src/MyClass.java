
public class MyClass {
	/*public int add(int a,int b) {
		System.out.println("in int method");
		return a+b;
	}*/
	/*public int add(Integer a,Integer b) {
		System.out.println("in integer method");
		return a+b;
	}*/
	
	public int add(int a,int b,int c) {
		System.out.println("in int 3 method");
		return a+b+c;
	}
	
	public int add(int a,int b,int...c) {
		System.out.println("in varargs  method");
		return 10;
	}
	
	public String add(String a,String b) {
		System.out.println("in String method");
		return a+b;
	}
//	public Object add(Object a,Object b) {
//	System.out.println("in Object method");
//	return new Object();
//	}
	
//	public long add(long a,long b) {
//	System.out.println("in long method");
//	return a+b;
//	}
	
//	public Long add(Long a,Long b) {
//		System.out.println("in Long method");
//		return a+b;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass ob=new MyClass();
		//Integer a=10;
		//Integer b=34;
		
		ob.add(2, 3);
		ob.add(1, 2,5);
		ob.add(1, 2,5,2);
		ob.add("sainya", "saket");
	}
}
