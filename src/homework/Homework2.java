package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner menu = new Scanner(System.in);
		
		System.out.println("-----** 김밥천국 메뉴 **-----");
		System.out.println("1. 김치찌개 - 5,000원");
		System.out.println("2. 된장찌개 - 6,000원");
		System.out.println("3. 순두부찌개 - 7,000원");
		System.out.println();
		System.out.print("노승철님이 고른 메뉴 : ");
		int menuNo1 = menu.nextInt();
		
		System.out.print("김명준님이 고른 메뉴 : ");
		int menuNo2 = menu.nextInt();
		
		System.out.print("박종완님이 고른 메뉴 : ");
		int menuNo3 = menu.nextInt();
		
		System.out.print("고재호님이 고른 메뉴 : ");
		int menuNo4 = menu.nextInt();
		
		System.out.print("부준영님이 고른 메뉴 : ");
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
			menuStr1 = "김치찌개";
			price1 = 5000;
			break;
		case 2 :
			menuStr1 = "된장찌개";
			price1 = 6000;
			break;
		case 3 : 
			menuStr1 = "순두부찌개";
			price1 = 7000;
			break;
		default :
			System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
		}
			
		switch(menuNo2) {
		case 1 : 
			menuStr2 = "김치찌개";
			price2 = 5000;
			break;
		case 2 : 
			menuStr2 = "된장찌개";
			price2 = 6000;
			break;
		case 3 : 
			menuStr2 = "순두부찌개";
			price2 = 7000;
			break;
		default :
			System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
		}
		
		switch(menuNo3) {
		case 1 : 
			menuStr3 = "김치찌개";
			price3 = 5000;
			break;
		case 2 : 
			menuStr3 = "된장찌개";
			price3 = 6000;
			break;
		case 3 : 
			menuStr3 = "순두부찌개";
			price3 = 7000;
			break;
		default :
			System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
		}
		
		switch(menuNo4) {
		case 1 : 
			menuStr4 = "김치찌개";
			price4 = 5000;
			break;
		case 2 : 
			menuStr4 = "된장찌개";
			price4 = 6000;
			break;
		case 3 : 
			menuStr4 = "순두부찌개";
			price4 = 7000;
			break;
		default :
			System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
		}
		
		switch(menuNo5) {
		case 1 : 
			menuStr5 = "김치찌개";
			price5 = 5000;
			break;
		case 2 : 
			menuStr5 = "된장찌개";
			price5 = 6000;
			break;
		case 3 : 
			menuStr5 = "순두부찌개";
			price5 = 7000;
			break;
		default :
			System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
		}
		System.out.println();		
		System.out.println("주문하신 메뉴 : " + menuStr1 + ", "+ menuStr2 + ", "+ menuStr3 + ", "+ menuStr4 + ", "+ menuStr5);
		
		int sum = (price1 + price2 + price3 + price4 + price5);
		System.out.println("총지불 금액 : " + sum + "원 입니다.");
		System.out.println("더치페이 금액 : " + (sum / 5) + "원 입니다.");
	}
		
}