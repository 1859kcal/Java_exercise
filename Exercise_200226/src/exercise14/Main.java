package exercise14;

import java.util.Random;

public class Main {

	public static void main(String[] arg) {
		Random random = new Random();
		int a = random.nextInt(100) + 1;
		int b = random.nextInt(100) + 1;
		int c = random.nextInt(100) + 1;
		int[] arr = {a,b,c};
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("arr = {" + a + "," + b + "," + c + "}");
		System.out.println("最大値は" + max);
	}
}
