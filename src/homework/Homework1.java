package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner report = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = report.next();
		
		System.out.println("���������� �Է��ϼ���");
		int kor = report.nextInt();
		
		System.out.println("���������� �Է��ϼ���");
		int math = report.nextInt();
		
		System.out.println("���������� �Է��ϼ���");
		int eng = report.nextInt();
		
		long sum = kor + math + eng;
		long avg = (kor + math + eng)/3;
		
		System.out.println("��������������������������������������������������");
		System.out.println(" ����ǥ ");
		System.out.println("��������������������������������������������������");
		System.out.println(" �̸� : "+name);
		System.out.println("��������������������������������������������������");
		System.out.println(" ���� "+kor);
		System.out.println(" ���� "+math);
		System.out.println(" ���� "+eng);
		System.out.println("��������������������������������������������������");
		System.out.println(" �հ����� " +sum);
		System.out.println(" ������� " +avg);
		System.out.println("��������������������������������������������������");
	}

}
