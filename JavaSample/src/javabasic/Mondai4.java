package javabasic;

public class Mondai4 {

	public static void main(String[] args) {
		int j = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.println(i + "回目：" + j);
				continue;
			}else {
				j += i;
				System.out.println(i + "回目：" + j);
			}
		}
	}
}
