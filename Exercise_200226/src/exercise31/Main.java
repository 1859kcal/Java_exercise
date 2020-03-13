package exercise31;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"asahi","blind","ai","acod","local",null};

		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) {
				if(arr[i].startsWith("a")) {
					System.out.println(arr[i] + " ");
				}
			}
		}
	}

}
