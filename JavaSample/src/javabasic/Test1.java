package javabasic;

public class Test1 {

	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			if(i%5==0) {
				System.out.println(i);
			}else {
				continue;
			}
		}
	}

}
