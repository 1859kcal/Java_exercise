package javabasic;

import java.util.Random;

public class Mondai3 {

	public static void main(String[] args) {
		Random r = new Random();
		int coins[] = {1,5,10,50,100,500,r.nextInt(500)+501};
		int i = r.nextInt(7);
		int jpcoin = coins[i];

		switch(i) {
			case 0: case 1:
				System.out.println("受付硬貨：" + jpcoin + "円硬貨");
				System.out.println("この硬貨は単位が小さいため、受付できません。");
				break;
			case 2: case 3: case 4: case 5:
				System.out.println("受付硬貨：" + jpcoin + "円硬貨");
				System.out.println("硬貨を受付しました。");
				break;
			default:
				System.out.println("受付硬貨：" + jpcoin + "円硬貨");
				System.out.println("こ　の硬貨は受付できません。");
		}
	}

}
