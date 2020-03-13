package exercise11;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(10) + 1;
//		int n = 4;
		for(int i=0; i<n; i++) {
			for(int j=n-i; j>0; j--) {
				System.out.print("●");
			}
			System.out.println();
		}
	}

}
