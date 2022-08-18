package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int gameScore = 150;
		int gameScore2 = 150;
		
		int lastScore = ++gameScore; // 먼저 더한 후 출력
		int lastScore2 = gameScore2++;
		
		System.out.println(lastScore);
		System.out.println(lastScore2);
		System.out.println(gameScore);
		System.out.println(gameScore2);
	}

}
