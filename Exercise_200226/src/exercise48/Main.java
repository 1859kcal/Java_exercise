package exercise48;

public class Main {

	public static void main(String[] args) {
		Object[] students = {"太郎","花子","次郎"};
		for(int i=0; i<students.length; i++) {
			String str = (String)students[i];
			System.out.println(str.length());
		}
	
	}

}
