package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner menu = new Scanner(System.in);
		
		System.out.println("-----** ���õ�� �޴� **-----");
		System.out.println("1. ��ġ� - 5,000��");
		System.out.println("2. ����� - 6,000��");
		System.out.println("3. ���κ�� - 7,000��");
		System.out.println();
		System.out.print("���ö���� �� �޴� : ");
		int menuNo1 = menu.nextInt();
		
		System.out.print("����ش��� �� �޴� : ");
		int menuNo2 = menu.nextInt();
		
		System.out.print("�����ϴ��� �� �޴� : ");
		int menuNo3 = menu.nextInt();
		
		System.out.print("����ȣ���� �� �޴� : ");
		int menuNo4 = menu.nextInt();
		
		System.out.print("���ؿ����� �� �޴� : ");
		int menuNo5 = menu.nextInt();
		
		String menuStr1 = "";
		String menuStr2 = "";
		String menuStr3 = "";
		String menuStr4 = "";
		String menuStr5 = "";
		int price1 = 0;
		int price2 = 0;
		int price3 = 0;
		int price4 = 0;
		int price5 = 0;
		
		switch(menuNo1) {
		case 1 :
			menuStr1 = "��ġ�";
			price1 = 5000;
			break;
		case 2 :
			menuStr1 = "�����";
			price1 = 6000;
			break;
		case 3 : 
			menuStr1 = "���κ��";
			price1 = 7000;
			break;
		default :
			System.out.println("�����Ͻ� �޴��� ���� �޴��Դϴ�.");
		}
			
		switch(menuNo2) {
		case 1 : 
			menuStr2 = "��ġ�";
			price2 = 5000;
			break;
		case 2 : 
			menuStr2 = "�����";
			price2 = 6000;
			break;
		case 3 : 
			menuStr2 = "���κ��";
			price2 = 7000;
			break;
		default :
			System.out.println("�����Ͻ� �޴��� ���� �޴��Դϴ�.");
		}
		
		switch(menuNo3) {
		case 1 : 
			menuStr3 = "��ġ�";
			price3 = 5000;
			break;
		case 2 : 
			menuStr3 = "�����";
			price3 = 6000;
			break;
		case 3 : 
			menuStr3 = "���κ��";
			price3 = 7000;
			break;
		default :
			System.out.println("�����Ͻ� �޴��� ���� �޴��Դϴ�.");
		}
		
		switch(menuNo4) {
		case 1 : 
			menuStr4 = "��ġ�";
			price4 = 5000;
			break;
		case 2 : 
			menuStr4 = "�����";
			price4 = 6000;
			break;
		case 3 : 
			menuStr4 = "���κ��";
			price4 = 7000;
			break;
		default :
			System.out.println("�����Ͻ� �޴��� ���� �޴��Դϴ�.");
		}
		
		switch(menuNo5) {
		case 1 : 
			menuStr5 = "��ġ�";
			price5 = 5000;
			break;
		case 2 : 
			menuStr5 = "�����";
			price5 = 6000;
			break;
		case 3 : 
			menuStr5 = "���κ��";
			price5 = 7000;
			break;
		default :
			System.out.println("�����Ͻ� �޴��� ���� �޴��Դϴ�.");
		}
		System.out.println();		
		System.out.println("�ֹ��Ͻ� �޴� : " + menuStr1 + ", "+ menuStr2 + ", "+ menuStr3 + ", "+ menuStr4 + ", "+ menuStr5);
		
		int sum = (price1 + price2 + price3 + price4 + price5);
		System.out.println("������ �ݾ� : " + sum + "�� �Դϴ�.");
		System.out.println("��ġ���� �ݾ� : " + (sum / 5) + "�� �Դϴ�.");
	}
		
}