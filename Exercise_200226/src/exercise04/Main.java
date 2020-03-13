package exercise04;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(200) - 100;
//		int n = 0;
		if(n>0) {
			for(int i=1; n>0; i++) {
				n -= 1;
				System.out.println(i + "回目：" + n);
			}
		}else if (n<0) {
				for(int j=1; n<0; j++) {
					n += 1;
					System.out.println(j + "回目：" + n);
				}
		}else {
			System.out.println(n + "です。");
		}
	}

}
