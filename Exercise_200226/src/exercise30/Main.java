package exercise30;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"bug","asd","el"};
		String maxString = arr[0];
		String maxString2 = "";

		for(int j=1; j<arr.length; j++) {
			if(maxString.length() < arr[j].length()) {
				maxString = arr[j];
			}else if (maxString.length() == arr[j].length()) {
				maxString2 = " " + arr[j];
			}
		}
		System.out.println("最大文字数の文字列は " + maxString + maxString2 );

	}

}
