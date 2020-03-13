package javabasic;

import org.apache.commons.lang3.StringUtils;

public class Mondai8 {

	public static void main(String[] args) {
		int i=1; //カウンタ
		int j=1;
		int g=10;
		String space="　";
		String delta="△";
		while(i<=10) {
		String rep=StringUtils.repeat(space, (g-i));
		String rep2=StringUtils.repeat(delta, j);
			System.out.println(rep+rep2);
			i++;
			j+=2;
		}
	}

}
