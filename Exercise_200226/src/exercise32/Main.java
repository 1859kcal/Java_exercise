package exercise32;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(200) - 100;
		String judge = "3";
		System.out.println("num = " + num);
		String numString = Integer.toString(num);
		int result = numString.indexOf(judge);

		if(result == -1) {
			System.out.println("numには3が含まれていません。");
		}else {
			System.out.println("numには3が含まれています。");
		}

	}
}
