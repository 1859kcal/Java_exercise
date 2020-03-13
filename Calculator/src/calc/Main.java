package calc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i1 = 0;
		int i2 = 0;
		int num = 0;
		int op = 0;
		Operator operator = new Operator();

		System.out.println("値１を入力してください");
		System.out.print("値１＞");

		i1 = sc.nextInt();

		System.out.println("値２を入力してください");
		System.out.print("値２＞");

		i2 = sc.nextInt();

		System.out.println("演算子に対応する数字を入力してください");
		System.out.println("1:＋ 2:ー 3:＊ 4:／");
		System.out.print("＞");

		op = sc.nextInt();

		switch(op) {
			case 1:
				num = operator.addition(i1, i2);
				System.out.print(i1 + " ＋ " + i2 + " ＝ " + num);
				break;
			case 2:
				num = operator.subtraction(i1, i2);
				System.out.print(i1 + " ー " + i2 + " ＝ " + num);
				break;
			case 3:
				num = operator.multiplication(i1, i2);
				System.out.print(i1 + " ＊ " + i2 + " ＝ " + num);
				break;
			case 4:
				num = operator.division(i1, i2);
				System.out.print(i1 + " ／ " + i2 + " ＝ " + num);
				break;
			default :
				System.out.println("演算子の指定が間違っています");
		}

		sc.close();
	}

}
