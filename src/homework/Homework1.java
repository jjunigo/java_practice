package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner report = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = report.next();
		
		System.out.println("국어점수를 입력하세요");
		int kor = report.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		int math = report.nextInt();
		
		System.out.println("영어점수를 입력하세요");
		int eng = report.nextInt();
		
		long sum = kor + math + eng;
		long avg = (kor + math + eng)/3;
		
		System.out.println("─────────────────────────");
		System.out.println(" 성적표 ");
		System.out.println("─────────────────────────");
		System.out.println(" 이름 : "+name);
		System.out.println("─────────────────────────");
		System.out.println(" 국어 "+kor);
		System.out.println(" 수학 "+math);
		System.out.println(" 영어 "+eng);
		System.out.println("─────────────────────────");
		System.out.println(" 합계점수 " +sum);
		System.out.println(" 평균점수 " +avg);
		System.out.println("─────────────────────────");
	}

}
