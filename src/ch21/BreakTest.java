package ch21;

public class BreakTest {

	public static void main(String[] args) {

		int sum = 0;
		int num;
		
		for(num=1; ; num++) {
			
			sum += num;
			if(sum >= 100)
				break; // 100보다 크거나 같아질때 합을 멈춰라
			
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
