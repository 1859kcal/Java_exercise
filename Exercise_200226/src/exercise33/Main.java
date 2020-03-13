package exercise33;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(800) + 101;
//		int num = 121;
		String numString = Integer.toString(num);
		char[] arr = new char[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = numString.charAt(i);
		}

		System.out.println("[" + numString + "]");
		if(arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
			System.out.println("同じ数字が含まれています");
		}else {
			System.out.println("同じ数字は含まれていません");
		}
	}

}
