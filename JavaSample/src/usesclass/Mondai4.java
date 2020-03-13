package usesclass;

import java.util.Scanner;

public class Mondai4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input;
		int i=0;
		System.out.println("メールアドレスを入力してください");
		while(i<1) {
			System.out.print("＞");
			input=sc.nextLine();
			int mail=input.indexOf("@");
			if(mail==-1) {
				System.out.println("正しいメールアドレスを入力してください。");
			}else{
				mail=input.indexOf(".",mail);
				if(mail==-1) {
					System.out.println("正しいメールアドレスを入力してください。");
				}else{
					System.out.println("正しく入力されました。");
					i++;
				}
			}
		}
		sc.close();
	}

}
