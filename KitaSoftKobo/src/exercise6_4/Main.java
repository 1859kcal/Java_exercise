package exercise6_4;

public class Main {

	public static void main(String[] args) {
		int n = 3;

		triangle(n);
		System.out.println();
		triangle(n+1);
		System.out.println();
		triangle(n+2);
	}

	public static void triangle(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("＄");
			}
			System.out.println();
		}
	}

}
