package exercise49;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("for");
		words.add("Class");
		words.add("i");
		words.add("num");
		words.add("public");
		words.add("a");

		ArrayList<String> invalidWords = new ArrayList<String>();
		invalidWords.add("class");
		invalidWords.add("for");
		invalidWords.add("if");
		invalidWords.add("public");
		invalidWords.add("static");
		invalidWords.add("while");

		for(int i=0; i<words.size()-1; i++) {
			for(int j=0; j<words.size(); j++) {
				if(words.get(i)==invalidWords.get(j)) {
					words.remove(i);
				}
			}
		}

		for(String str : words) {
			System.out.println(str);
		}
	}

}
