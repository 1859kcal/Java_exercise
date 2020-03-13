package exercise07;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(200) - 100;
		int absValue = 0;
		if(num<0) {
			absValue = 0 - num;
		}else if (num>0) {
			absValue = num;
		}
		System.out.println(num + "の絶対値は" + absValue);
	}

}
