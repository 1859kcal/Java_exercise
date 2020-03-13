package Roop1;

import java.util.Random;

public class roop1 {

	public static void main(String[] args) {
		Random random = new Random();
		int s = random.nextInt(10);

//		int s = 5;

		for(int t=1; t<=s; t++) {
			for(int i=1; i<=s; i++) {
				for(int d=1; d<=s; d++) {
					for(int j=1; j<=i; j++) {
						System.out.print("●");
					}
					for(int k=s-i; k>=0; k--) {
						System.out.print("○");
					}
				}
				System.out.println();
			}
		}
	}

}
