package com.java.text;

public class Car {
//1、编写一个Java程序，并满足如下要求：  1）编写一个Car类，具有：   属性：品牌(mark)——String类型   价格（price）、速度（speed）——int型
//	功能：驾驶（void drive( )）   
//	功能：变速（void speedChange(int newSpeed)），把新速度赋给speed 
//	3）定义主类E，在其main方法中创建Car类的两个对象：aodi和benchi的对
//	象并测试其对象的特性。  

 private String mark;
 private int price;
 private int speed;
  
 public void setMark(String mark ){
	 this.mark=mark;
 }
 public String getMark(){
	 return mark;
 }
 
 public void setPrice(int price ){
	 this.price =price ;
 }
 public int getPrice(){
	 return price ;
 }
 
 public void setSpeed(int speed ){
	 this.speed=speed;
 }
 public int getSpeed(){
	 return speed;
 }
 
 public void drive( ){
	System.out.println("本车正在驾驶");
 }
 
 public void speedChange(int newSpeed){
	 this.speed=newSpeed;
	 System.out.println(this.mark+"车现在的速度是"+speed);
	 }
 public void print(){
	 System.out.println("本车的品牌是"+this.mark+","+this.mark+"车的价格是"+this.price+","+this.mark+"车原来的速度是"+this.speed);
 }

 
 
 
 
 
 
 
}
