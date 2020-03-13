package exercise37;

public class Main {

	public static void main(String[] args) {
		char[] chars = {'a','p','p','l','e'};
//		char[] chars = {'o','r','a','n','g','e'};
		boolean judge = false;

		for(int i=0; i<chars.length-1; i++) {
			for(int j=i+1; j<chars.length; j++) {
				if(chars[i]==chars[j]) {
					judge = true;
				}
			}
		}

		if(judge==true) {
			System.out.println("要素が重複しています");
		}else {
			System.out.println("要素が重複していません");
		}

	}

}
