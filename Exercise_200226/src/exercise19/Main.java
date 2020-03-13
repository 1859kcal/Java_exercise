package exercise19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean bl = true;
		String yes = "yes";
		System.out.println("文字を入力してください。");
		System.out.println("[yes]と入力されない限り処理を繰り返します。");

		do {
			System.out.print("＞");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();

			if(yes.equals(str)) {
				bl = false;
				System.out.println("処理を終了します。");
			}
		}while(bl==true);
	}

}
