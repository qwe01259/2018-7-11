package com.java.text;

public class Cat {
  private String type ;
  private int  age;
  private String   color ;
  
  public void setType(String type ){
		 this.type=type;
	 }
	 public String getType(){
		 return type;
	 }
	public void shuxing (int  age,String   color ){
		 this.age=age;
		 this.color=color;
	}
  public void print(){
	  System.out.println("这只猫"+this.age+"岁了，它的颜色是"+this.color);
  }
  
  
  
  
  
  
  
}
