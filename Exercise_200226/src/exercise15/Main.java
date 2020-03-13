package exercise15;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int n = random.nextInt(50) + 1;
//		int n = 5;
		int sum = 0;

		for(int i=1; i<=n; i++) {
			sb.append(i);
			sum += i;
			if (i!=n) {
				sb.append("+");
			}
		}
		System.out.println(new String(sb));
		System.out.println("=" + sum);


	}

}
