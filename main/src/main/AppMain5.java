package main;
import java.util.Scanner;
public class AppMain5 {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	/**
	 * 后宫娘娘姓名数组
	 * **/
	String[]nnNameArray ={"西施","王昭君","杨幂","佟丽娅","","",""};
	/**
	 * 后宫娘娘级别数组
	 * **/
	String[]LevelName={"贵人","嫔妃","贵妃","皇后","皇太后","答应",""};
	int[]Level=new int[10];
	
	int[]loves=new int[10];
	
	int nnCount=4;
	//设定默认好感度为100;
		for (int i = 0; i < nnCount; i++) {
			loves[i]=100;
		}
	int gameDays=1;
	
	while(gameDays<=10){
		System.out.println("游戏进行到第"+gameDays +"天");
		System.out.println("1.皇帝下诏要选妃\t\t(增加)");
		System.out.println("2.朕要翻牌子宠幸\t\t(修改状态)");
		System.out.println("3.打入冷宫\t\t\t(删除)");
		System.out.println("4.朕的爱妃呢？\t\t(查找，修改)");
		System.out.print("陛下请选择：");
		int choice= input.nextInt();
		switch (choice) {
case 1:
	if(nnCount==nnNameArray.length){
		System.out.println("皇上，你他娘的要注意身体呀！");
		break;
	}
			System.out.println("请输入新进娘娘的名讳:");
			//增加姓名等
			String newName=input.next();
			nnNameArray[nnCount]=newName;
			loves[nnCount]=100;
			//其他娘娘的操作
			for (int i = 0; i <nnCount; i++) {
				loves[i] -=10;
			}
			nnCount++;
			break;
case 2:
			//反牌宠幸，被翻牌的人的好感度加20，其他人的好感度减10
	System.out.println("请输入你娘娘的名讳：");
	String Name=input.next();
	//查找
	int searchIndex=-1;
	for (int i = 0; i < nnCount; i++) {
		if(Name.compareTo(nnNameArray[i])==0){//姓名相等的情况下
			searchIndex=i;
			break;
		}
		
	}
	if( searchIndex==-1){
		System.out.println("陛下，没有这个娘娘啊");
		break;
		}
	//找到的话，
	loves[searchIndex]+=20;
	if(Level[searchIndex]+1==LevelName.length){
		System.out.println(nnNameArray[searchIndex]+"已经母仪天下了");
		loves[searchIndex]+=10;
		break;
	}
	[searchIndex]++;
	
	
			break;
case 3:
			
			break;
case 4:
			
			break;
		default:
			System.out.println("必须输入1到4之内的数字呀，铁汉汉");
			continue;
		}
		System.out.println("姓名\t\t级别\t\t好感度");
		gameDays++;
		for (int i = 0; i < nnCount; i++) {
			System.out.println(nnNameArray[i]+"\t"+LevelName[Level[i]]+"\t"+loves[i]);
		}	
	}
	
	for (int i = 0; i < nnCount; i++) {
		System.out.println(nnNameArray[i]+"\t"+LevelName[Level[i]]+"\t"+loves[i]);
		
	}
	
	 
	
}
}
