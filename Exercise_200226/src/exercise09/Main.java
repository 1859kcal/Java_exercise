package exercise09;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(10) + 1;
//		int n = 3;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++) {
				System.out.print("●");
			}
			System.out.println();
		}
	}
}
