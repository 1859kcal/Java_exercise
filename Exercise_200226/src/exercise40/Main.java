package exercise40;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(1000) + 1;
		String numString = String.valueOf(num);
		System.out.println(num + "→" + numString);
	}

}
