package com.java.text2;

import java.util.Scanner;

public class Shuzu {
 public static void main(String[] args) {
	 //����---���������һ����ͬ���͵�����
	 //��������ķ�ʽ ---ʲô���� ������
	 //��������   1.������������  2.������������
	 int[] a={1,2,3,4,5};
	 //���ַ�ʽ����������һ��Ҫָ������ĳ���
	 int[] b=new int[9];
	 //�����ִ�����ʽ
	 int[] c=new int[]{1,2,3,4,5,6,7};
	 
	/* int[] d=new int[15];
	 for(int e=0;e<d.length;e++){
		 d[e]=e+10;
		 System.out.println(d[e]);*/
		//����Ҫ֪�������±����Ҫʹ���±��ʱ�������forѭ��
	// }
    
  /*  int [] f=new int[4];
    for(int s:f){
    	System.out.println(s);
    }
 */
 // ���ֻ�ǲ鿴�����е�������ǿfor
   // ð������
	 //�������д���
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
