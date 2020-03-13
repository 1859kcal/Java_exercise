package exercise47;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> strArray = new ArrayList<String>();
		strArray.add("api");
		strArray.add("android");
		strArray.add("binary");
		strArray.add("class");
		strArray.add("cache");
		strArray.add("domain");
		strArray.add("database");
		char judge = 'c';

		for(int i=0; i<strArray.size(); i++) {
			String s = strArray.get(i);
			if(judge == s.charAt(0)) {
				strArray.remove(i);
			}
		}

		for(String str : strArray) {
			System.out.println(str);
		}
	}

}
