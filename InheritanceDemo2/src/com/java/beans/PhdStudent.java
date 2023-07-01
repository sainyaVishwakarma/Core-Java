package com.java.beans;

public class PhdStudent extends Student{
	private int sp_cou_mks;
	private String thesis;
	public PhdStudent() {
		super();
	}
	public PhdStudent(int id,String nm,String m,int m1, int m2, int m3,int sp_cou_mks, String thesis) {
		super(id,nm,m,m1,m2,m3);
		this.sp_cou_mks = sp_cou_mks;
		this.thesis = thesis;
	}
	public int getSp_cou_mks() {
		return sp_cou_mks;
	}
	public void setSp_cou_mks(int sp_cou_mks) {
		this.sp_cou_mks = sp_cou_mks;
	}
	public String getThesis() {
		return thesis;
	}
	public void setThesis(String thesis) {
		this.thesis = thesis;
	}
	@Override
	public String toString() {
		return super.toString()+"PhdStudent [sp_cou_mks=" + sp_cou_mks + ", thesis=" + thesis + "]";
	}
	
	public  float calcPer() {
		return (getM1()+getM2()+getM3()+getSp_cou_mks())/4;
	}
	
}
