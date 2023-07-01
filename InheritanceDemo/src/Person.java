
public class Person {
	private String pid;
	private String pname;
	private String mobile;
	static int cnt;
	static {
		cnt=0;
	}
	public Person(String type) {
		
		pid=type+cnt;
		pname=null;
		mobile=null;
	}
	
	public Person(String type,String pid, String pname, String mobile) {
		super();
		cnt++;
		this.pid = type+cnt;
		this.pname = pname;
		this.mobile = mobile;
	}
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		Person.cnt = cnt;
	}

	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mobile=" + mobile + "]";
	}
	
	
}
