package com.java.text;

public class Frist {
 public static void main(String[] args) {
	 //����  ���ö��󣨣�
	/*Car aodi=new Car();
	aodi.setMark("�µ�");
	aodi.setPrice(50);
	aodi.setSpeed(80);
	 aodi.print();
	aodi.drive();
	aodi.speedChange(120);
   
	
	Car benchi=new Car();
	benchi.setMark("����");
	benchi.setPrice(100);
	benchi.setSpeed(90);
	 benchi.print();
	benchi.drive();
	benchi.speedChange(120);
    */
	//è����
	/*Cat a=new Cat();
	a.setType("����ɯ��");	
	System.out.println(a.getType());
	a.shuxing(8, "��ɫ");
	a.print();
	*/
	//����һ�����������ƽ��ֵ
	/*int [] b=new int[]{6,9,10,24,9,15};
	double sum = 0;
	for (int i = 0; i < b.length; i++) {
         sum=sum+b[i];
	}
	double avg = sum / b.length;
	System.out.println("��������ƽ������"+avg);
	*/
	//����һ�����飬Ҫ��дһ��expand ��������ԭ������ĳ�������һ����������ԭ����
	//��ԭ�е�����
	 int[] f = { 1, 2, 3, 4, 5, 6 };

     f= getExtendsArray(f);

     for (int i = 0; i < f.length; i++) {

         System.out.print(f[i]);

     }

 }



 // ��չ����

 public static int[] getExtendsArray(int[] y) {

     int[] x=new int[y.length*2];

     System.arraycopy(y,0,x,0,y.length);

     y=x;

     return y;
	
	
	
	
	
	
 }	
	
}
