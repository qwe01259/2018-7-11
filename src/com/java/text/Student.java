package com.java.text;

public class Student {
private String sname;
private int sage;
private double sheight;
private double sweight;	
private double sgrade;	
private String sno;


public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSage() {
	return sage;
}
public void setSage(int sage) {
	this.sage = sage;
}
public double getSheight() {
	return sheight;
}
public void setSheight(double sheight) {
	this.sheight = sheight;
}
public double getSweight() {
	return sweight;
}
public void setSweight(double sweight) {
	this.sweight = sweight;
}
public double getSgrade() {
	return sgrade;
}
public void setSgrade(double sgrade) {
	this.sgrade = sgrade;
}
public String getSno() {
	return sno;
}
public void setSno(String sno) {
	this.sno = sno;
}	

public void exam(){
	System.out.println(this.sname+"���Գɼ�Ϊ:"+this.sgrade);
}


public String toString(){
  return "������"+this.sname+",ѧ��:"+this.sno+",���䣺"+this.sage+",��ߣ�"+this.sheight+",���أ�"+this.sheight+",�ɼ���"+this.sgrade;
}
	

	
	
}
