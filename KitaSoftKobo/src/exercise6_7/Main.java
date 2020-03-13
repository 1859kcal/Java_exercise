package exercise6_7;

public class Main {

	public static void main(String[] args) {
		int x = 10000;	//範囲の最小値
		int y = 10100;	//範囲の最大値

		for(int i=0; i<=(y-x); i++) {
			int n = x + i;
			primeNumber(n);
		}

	}

	public static void primeNumber(int n) {
		int i = 1;
		boolean bln = false;

		while(i<n-1) {
			int x = n % (n-i);
			int y = n / (n-i);
//			System.out.println(n + " / " + (n-i) + " = " + y + " … " + x);
			if(x==0) {
				bln = true;
			}
			i++;
		}

		if(bln == false) {
			System.out.println(n + "は素数です");
//		}else {
//			System.out.println(n + "は素数ではありません");
		}
	}

}
