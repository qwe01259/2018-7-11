package com.java.text;

public class Car {
//1����дһ��Java���򣬲���������Ҫ��  1����дһ��Car�࣬���У�   ���ԣ�Ʒ��(mark)����String����   �۸�price�����ٶȣ�speed������int��
//	���ܣ���ʻ��void drive( )��   
//	���ܣ����٣�void speedChange(int newSpeed)���������ٶȸ���speed 
//	3����������E������main�����д���Car�����������aodi��benchi�Ķ�
//	�󲢲������������ԡ�  

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
	System.out.println("�������ڼ�ʻ");
 }
 
 public void speedChange(int newSpeed){
	 this.speed=newSpeed;
	 System.out.println(this.mark+"�����ڵ��ٶ���"+speed);
	 }
 public void print(){
	 System.out.println("������Ʒ����"+this.mark+","+this.mark+"���ļ۸���"+this.price+","+this.mark+"��ԭ�����ٶ���"+this.speed);
 }

 
 
 
 
 
 
 
}
