package exercise22;

public class Main {
	public static void main(String[] args) {
        int sum = sumOf(1, 2);
        System.out.println(sum); // 3と出力される
    }

	// sumOfメソッドを記述
	public static int sumOf(int i1 , int i2) {
		int sum = i1 + i2;
		return sum;
	}
}
