package javabasic;

public class Mondai1 {

	public static void main(String[] args) {
		String hensuA = "AAA";
		String hensuB = "BBB";
		String temp;

		System.out.println("入れ替える前のAの値：" + hensuA);
		System.out.println("入れ替える前のBの値：" + hensuB);

		temp = hensuA;
		hensuA = hensuB;
		hensuB = temp;

		System.out.println("入れ替えた後のAの値：" + hensuA);
		System.out.println("入れ替えた後のBの値：" + hensuB);
	}

}
