package exercise18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str1 = "か";
		boolean bl = true;

		while(bl == true) {
			System.out.println("50音を1つ入力してください。");
			System.out.print("＞");
			Scanner sc = new Scanner(System.in);
			String str2 = sc.next();

			if(str1.equals(str2)) {
				bl = false;
				System.out.println("正解です。");
			}else {
				System.out.println("不正解です。");
				System.out.print("もう1度");
			}
		}
	}

}
