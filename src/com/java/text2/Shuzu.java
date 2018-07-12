package com.java.text2;

import java.util.Scanner;

public class Shuzu {
 public static void main(String[] args) {
	 //数组---是用来存放一组相同类型的数据
	 //定义数组的方式 ---什么类型 变量名
	 //数据类型   1.基本数据类型  2.引用数据类型
	 int[] a={1,2,3,4,5};
	 //这种方式创建的数组一定要指定数组的长度
	 int[] b=new int[9];
	 //第三种创建方式
	 int[] c=new int[]{1,2,3,4,5,6,7};
	 
	/* int[] d=new int[15];
	 for(int e=0;e<d.length;e++){
		 d[e]=e+10;
		 System.out.println(d[e]);*/
		//当你要知道数组下标或者要使用下标的时候，用这个for循环
	// }
    
  /*  int [] f=new int[4];
    for(int s:f){
    	System.out.println(s);
    }
 */
 // 如果只是查看数组中的内容增强for
   // 冒泡排序
	 //控制排列次数
	 Scanner input =new Scanner (System.in);
	 int [] x=new int[]{51,61,48,15,32,17};
	 for(int y=0;y<x.length-1;y++){
		 for(int z=0;z<x.length-1-y;z++){
			 if(x[z]>x[z+1]){
			 int t=0;
			 t=x[z];
			 x[z]=x[z+1];
			 x[z+1]=t;
			 }
		 } 
	 }for(int q:x){System.out.println(q);}
	 
	
	 
 }
}
