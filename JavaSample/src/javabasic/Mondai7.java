package javabasic;

public class Mondai7 {

	public static void main(String[] args) {
		int i=0; //jから引く値
		int j=10; //表示する値
		int k=1; //カウンタ

		while(k<=10) {
			System.out.println(k+"回目："+(j-i));
			i++;
			k++;
		}
	}
}
