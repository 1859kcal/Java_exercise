package javabasic;

import java.util.Random;

public class Mondai2 {

	public static void main(String[] args) {
		Random r = new Random();
		int age = r.nextInt(81);
		String[] genders = {"男性" , "女性" , "不明"};
		String gender = genders[r.nextInt(3)];

		if(gender==genders[2]) {
			System.out.println("性別：" + genders[2]);
			System.out.println("年齢：" + age);
			System.out.println("判別不能です。");
		}else if (gender==genders[0] && age<20) {
			System.out.println("性別：" + genders[0]);
			System.out.println("年齢：" + age);
			System.out.println("未成年の男性です。");
		}else if (gender==genders[0] && age>20) {
			System.out.println("性別：" + genders[0]);
			System.out.println("年齢：" + age);
			System.out.println("成人男性です。");
		}else if (gender==genders[1] && age<20) {
			System.out.println("性別：" + genders[1]);
			System.out.println("年齢：" + age);
			System.out.println("未成年の女性です。");
		}else if (gender==genders[1] && age>20) {
			System.out.println("性別：" + genders[1]);
			System.out.println("年齢：" + age);
			System.out.println("成人女性です。");
		}
	}

}
