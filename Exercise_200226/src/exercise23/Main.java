package exercise23;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int i1 = random.nextInt(100) + 1;
		int i2 = random.nextInt(100) + 1;

        int bigger = bigger(i1 , i2);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("大きい方は" + bigger); //大きい方を表示
    }

    // biggerメソッドを作成
	public static int bigger(int i1 , int i2) {
		int big = 0;
		if(i1>i2) {
			big = i1;
		}else {
			big = i2;
		}
		return big;
	}

}
