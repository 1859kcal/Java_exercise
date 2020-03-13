package javabasic;

public class Mondai5 {

	public static void main(String[] args) {
		int j = 0;
		int i = 1;
		while(i<=10){
			if(i%2==1) {
				System.out.println(i + "回目：" + j);
			}else {
				j += i;
				System.out.println(i + "回目：" + j);
			}
			i++;
		}
	}

}
