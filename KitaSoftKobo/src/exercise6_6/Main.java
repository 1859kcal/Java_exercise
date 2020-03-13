package exercise6_6;

public class Main {

	public static void main(String[] args) {
		int n = 6;

		multiTable(n);
	}

	public static void multiTable(int n) {
		int multi = 0;

		for(int i=1; i<=9; i++) {
			multi = n * i;
			if(String.valueOf(multi).length()==1) {
				System.out.print(" " + multi + " ");
			}else {
				System.out.print(multi + " ");
			}
		}
		System.out.println();
	}

}
