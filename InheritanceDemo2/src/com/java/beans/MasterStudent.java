package com.java.beans;

public class MasterStudent extends Student{
	private int m4,m5,sp_cou_mks;
	public MasterStudent(int id,String nm,String m,int m1, int m2, int m3,int m4, int m5, int sp_cou_mks) {
		super(id,nm,m,m1,m2,m3);
		this.m4 = m4;
		this.m5 = m5;
		this.sp_cou_mks = sp_cou_mks;
	}

	public MasterStudent() {
		super();
	}
	
	public int getM4() {
		return m4;
	}

	public void setM4(int m4) {
		this.m4 = m4;
	}

	public int getM5() {
		return m5;
	}

	public void setM5(int m5) {
		this.m5 = m5;
	}

	public int getSp_cou_mks() {
		return sp_cou_mks;
	}

	public void setSp_cou_mks(int sp_cou_mks) {
		this.sp_cou_mks = sp_cou_mks;
	}

	@Override
	public String toString() {
		return super.toString()+"MasterStudent [m4=" + m4 + ", m5=" + m5 + ", sp_cou_mks=" + sp_cou_mks + "]";
	}
	
	public  float calcPer() {
		return (getM1()+getM2()+getM3()+getM4()+getM5()+getSp_cou_mks())/6;
	}

	
}
