package exercise06;

public class Main {

	public static void main(String[] args) {
		int[] array = {64,3,45,291,178};
		int min = array[0];

		for(int i=1; i<array.length; i++) {
			if(min>array[i]) {
				min = array[i];
			}else if (min<array[i]) {
				continue;
			}
		}
		System.out.println("最小値：" + min);
	}

}
