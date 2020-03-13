package exercise6_8;

public class Main {

	public static void main(String[] args) {
		int n = 20;
		int m = 11;

		for(int i=m; i<=n; i++) {
			System.out.println(i + "：" + fibonacci(i));
		}
	}

	public static int fibonacci(int n) {
		if(n==1 || n==0) {
			return n;
		}else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}

}
