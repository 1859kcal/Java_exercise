package exercise01;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(200) - 100;

		if(n==0) {
			System.out.println("0です。");
		}else if (n>0) {
			System.out.println(n + "は正です。");
		}else {
			System.out.println(n + "は負です。");
		}
	}

}
