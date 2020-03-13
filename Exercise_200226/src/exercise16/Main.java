package exercise16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("入力された文字を逆順で表示します。");
		System.out.println("文字を入力してください。");
		System.out.println("処理を終了する場合は[exit]と入力してください。");
		int n = 0;
		String judge = "exit";

		do {
			System.out.print("＞");

			Scanner sc = new Scanner(System.in);
			String str = sc.next();

			if(str.equals(judge)) {
				n = 1;
			}else {

				StringBuilder sb = new StringBuilder(str);
				sb.reverse();

				System.out.println(sb);
				sc.close();
			}
		}while(n<1);
		System.out.println("処理を終了しました。");

	}

}
