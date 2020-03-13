package javabasic;

public class Test4 {

	public static void main(String[] args) {
		int height=10;
		for(int i=0; i<height; i++) {
			for(int j=0; j<height-i; j++) {
				System.out.print("＿");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}

}
