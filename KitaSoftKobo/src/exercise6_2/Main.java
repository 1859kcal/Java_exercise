package exercise6_2;

public class Main {

	public static void main(String[] args) {
		int i1 = 3;
		int i2 = 5;

		System.out.println(average(i1, i2));
	}

	public static int average(int i1 , int i2) {
		int num = (i1 + i2) / 2;
		return num;
	}

}
