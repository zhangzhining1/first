package main;

import java.util.Scanner;

public class Circle {
	//圆的半径，周长，和面积
public double radius;
public double perimeter;
public double area;

public void input(){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入半径：");
	radius=input.nextDouble();
	input.close();
}
public void showp(){
	if(radius<=0){
		input();//强制让用户输入半径
	}
	
	perimeter=radius*2*Math.PI;
	System.out.println("周长为"+perimeter);
}
public void showa(){
	area=radius*radius*Math.PI;//radius*radius = Math.pow(radius,2)
	System.out.println("面积为"+area);
}
}
