package main;

import java.util.Scanner;

public class Circle {
	//Բ�İ뾶���ܳ��������
public double radius;
public double perimeter;
public double area;

public void input(){
	Scanner input=new Scanner(System.in);
	System.out.println("������뾶��");
	radius=input.nextDouble();
	input.close();
}
public void showp(){
	if(radius<=0){
		input();//ǿ�����û�����뾶
	}
	
	perimeter=radius*2*Math.PI;
	System.out.println("�ܳ�Ϊ"+perimeter);
}
public void showa(){
	area=radius*radius*Math.PI;//radius*radius = Math.pow(radius,2)
	System.out.println("���Ϊ"+area);
}
}
