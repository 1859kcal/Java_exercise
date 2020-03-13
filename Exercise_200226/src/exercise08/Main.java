package exercise08;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(100);
		int y = random.nextInt(100);
		int dif = x - y;
		if(dif<0) {
			System.out.println(x + "と" + y + "の差は" + (-dif));
		}else {
			System.out.println(x + "と" + y + "の差は" + dif);
		}
	}

}
