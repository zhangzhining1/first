package main;
import java.util.Scanner;
public class AppMain5 {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	/**
	 * ��������������
	 * **/
	String[]nnNameArray ={"��ʩ","���Ѿ�","����","١���","","",""};
	/**
	 * �����Ｖ������
	 * **/
	String[]LevelName={"����","����","����","�ʺ�","��̫��","��Ӧ",""};
	int[]Level=new int[10];
	
	int[]loves=new int[10];
	
	int nnCount=4;
	//�趨Ĭ�Ϻøж�Ϊ100;
		for (int i = 0; i < nnCount; i++) {
			loves[i]=100;
		}
	int gameDays=1;
	
	while(gameDays<=10){
		System.out.println("��Ϸ���е���"+gameDays +"��");
		System.out.println("1.�ʵ���گҪѡ��\t\t(����)");
		System.out.println("2.��Ҫ�����ӳ���\t\t(�޸�״̬)");
		System.out.println("3.�����乬\t\t\t(ɾ��)");
		System.out.println("4.�޵İ����أ�\t\t(���ң��޸�)");
		System.out.print("������ѡ��");
		int choice= input.nextInt();
		switch (choice) {
case 1:
	if(nnCount==nnNameArray.length){
		System.out.println("���ϣ��������Ҫע������ѽ��");
		break;
	}
			System.out.println("�������½����������:");
			//����������
			String newName=input.next();
			nnNameArray[nnCount]=newName;
			loves[nnCount]=100;
			//��������Ĳ���
			for (int i = 0; i <nnCount; i++) {
				loves[i] -=10;
			}
			nnCount++;
			break;
case 2:
			//���Ƴ��ң������Ƶ��˵ĺøжȼ�20�������˵ĺøжȼ�10
	System.out.println("����������������䣺");
	String Name=input.next();
	//����
	int searchIndex=-1;
	for (int i = 0; i < nnCount; i++) {
		if(Name.compareTo(nnNameArray[i])==0){//������ȵ������
			searchIndex=i;
			break;
		}
		
	}
	if( searchIndex==-1){
		System.out.println("���£�û��������ﰡ");
		break;
		}
	//�ҵ��Ļ���
	loves[searchIndex]+=20;
	if(Level[searchIndex]+1==LevelName.length){
		System.out.println(nnNameArray[searchIndex]+"�Ѿ�ĸ��������");
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
			System.out.println("��������1��4֮�ڵ�����ѽ��������");
			continue;
		}
		System.out.println("����\t\t����\t\t�øж�");
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
