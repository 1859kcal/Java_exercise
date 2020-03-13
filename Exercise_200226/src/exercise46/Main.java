package exercise46;

public class Main {

	public static void main(String[] args) {
		String str = "apple";
		char[] chr = new char[str.length()];

		for(int i=0; i<str.length(); i++) {
			chr[i]= str.charAt(i);
		}

		for(char c : chr) {
			System.out.println(c);
		}
	}

}
