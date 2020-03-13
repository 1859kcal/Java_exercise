package exercise35;

public class Main {

	public static void main(String[] args) {
		char[] chars = {'a','p','p','l','e'};
		char search = 'p';
		int index = -1;

		for(int i=chars.length-1; i>=0; i--) {
			if(chars[i]==search) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}

}
