package exercise28;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(20);
//		int n = 10;

		for(int i=n; i>=0; i--){
			System.out.println(i);
		}
	}

}
