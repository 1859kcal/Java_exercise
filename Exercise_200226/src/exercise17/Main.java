package exercise17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean bl = true;

		while(bl == true) {
			System.out.println("文字を入力してください。");
			System.out.print("＞");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();

			if(str.length()<10) {
				bl = false;
				System.out.println("入力された文字数は" + str.length() + "です。");
			}else {
				System.out.println("入力された文字は10文字を超えています。");
				System.out.print("もう1度");
			}
		}
	}

}
