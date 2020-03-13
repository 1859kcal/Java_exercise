package exercise05;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(99)+1;
		System.out.println("設定した値：" + n);
		for(int i=1; i<n; i++) {
			System.out.print(i + ",");
		}
		System.out.println(n);
	}

}
