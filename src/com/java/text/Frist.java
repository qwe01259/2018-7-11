package com.java.text;

public class Frist {
 public static void main(String[] args) {
	 //类型  引用对象（）
	/*Car aodi=new Car();
	aodi.setMark("奥迪");
	aodi.setPrice(50);
	aodi.setSpeed(80);
	 aodi.print();
	aodi.drive();
	aodi.speedChange(120);
   
	
	Car benchi=new Car();
	benchi.setMark("奔驰");
	benchi.setPrice(100);
	benchi.setSpeed(90);
	 benchi.print();
	benchi.drive();
	benchi.speedChange(120);
    */
	//猫的类
	/*Cat a=new Cat();
	a.setType("伊丽莎白");	
	System.out.println(a.getType());
	a.shuxing(8, "白色");
	a.print();
	*/
	//计算一个整数数组的平均值
	/*int [] b=new int[]{6,9,10,24,9,15};
	double sum = 0;
	for (int i = 0; i < b.length; i++) {
         sum=sum+b[i];
	}
	double avg = sum / b.length;
	System.out.println("这个数组的平均数是"+avg);
	*/
	//给定一个数组，要求写一个expand 函数，把原有数组的长度扩容一倍，并保留原有数
	//组原有的内容
	 int[] f = { 1, 2, 3, 4, 5, 6 };

     f= getExtendsArray(f);

     for (int i = 0; i < f.length; i++) {

         System.out.print(f[i]);

     }

 }



 // 扩展数组

 public static int[] getExtendsArray(int[] y) {

     int[] x=new int[y.length*2];

     System.arraycopy(y,0,x,0,y.length);

     y=x;

     return y;
	
	
	
	
	
	
 }	
	
}
