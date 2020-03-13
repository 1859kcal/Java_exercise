package test1;

public class Main {

	public static void main(String[] args) {
		String s1 = "＿";
		String s2 = "＊";
		int n = 5;

		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.print(s1);
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print(s2);
			}
			System.out.println();
		}
	}

}
