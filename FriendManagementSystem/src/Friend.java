import java.text.SimpleDateFormat;
import java.util.Date;

public class Friend {
	private int fId;
	private String fName;
	private String mobile;
	private String email;
	private String add;
	private Date dob;

	
	public Friend() {
		fId=0;
		fName=null;
		mobile=null;
		email=null;
		add=null;
		dob=null;
		
//		this(0,null,null,null,null,null,null);
	}
	
	
	public Friend(int id,String fn,String m,String mail,String address,Date bdate) {
		this.fId=id;
		this.fName=fn;
		this.mobile=m;
		this.email=mail;
		this.add=address;
		this.dob=bdate;
		
	}
	
	public int getFid() {
		return fId;
	}
	
	public void setFid(int id) {
			this.fId=id;
	}
	
	public String getFname() {
		return fName;
	}
	
	public void setFname(String nm) {
		this.fName=nm;
	}
	
	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	




	public String toString() {
		SimpleDateFormat sdt=new SimpleDateFormat("dd/MM/yyyy");
		String d=sdt.format(dob);
		String str="";
		
		return "Id: "+ fId + "\nName: "+fName+"\nMobile: "+mobile+"\nEmail Id: "+email+"\nAddress: "+add+"\nDOB: "+d;
		
	}
	
}
