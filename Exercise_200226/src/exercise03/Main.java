package exercise03;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(100);
		int n = num % 2;
		switch(n) {
			case 0:
				System.out.println(num + "は偶数です。");
				break;
			case 1:
				System.out.println(num + "は奇数です。");
				break;
		}

	}

}
