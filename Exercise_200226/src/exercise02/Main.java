package exercise02;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.println(i + "回目の合計は" + sum);
		}
		System.out.println("合計は" + sum);
	}

}
