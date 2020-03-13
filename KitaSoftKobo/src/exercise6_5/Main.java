package exercise6_5;

public class Main {

	public static void main(String[] args) {
		int n = 3;
		char chr = '＊';

		triangle(n , chr);
		System.out.println();
		triangle(n+1 , chr);
		System.out.println();
		triangle(n+2 , chr);
	}

	public static void triangle(int n , char chr) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(chr);
			}
			System.out.println();
		}
	}

}
