package exercise6_3;

public class Main {

	public static void main(String[] args) {
		int i1 = 3;
		int i2 = 8;

		System.out.println(comparison(i1, i2));

	}

	public static int comparison(int i1 , int i2) {
		int max = i1;

		if(max<i2) {
			max = i2;
		}

		return max;
	}

}
