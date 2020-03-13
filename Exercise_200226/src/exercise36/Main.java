package exercise36;

public class Main {

	public static void main(String[] args) {
		char[] chars = {'a','p','p','l','e'};
		char search = 'p';
		int index = 0;
		for(int i=0; i<chars.length; i++) {
			if(chars[i]==search) {
				index++;
			}
		}
		System.out.println(index);
	}

}
