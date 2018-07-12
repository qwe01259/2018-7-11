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
	System.out.println(this.sname+"考试成绩为:"+this.sgrade);
}


public String toString(){
  return "姓名："+this.sname+",学号:"+this.sno+",年龄："+this.sage+",身高："+this.sheight+",体重："+this.sheight+",成绩："+this.sgrade;
}
	

	
	
}
