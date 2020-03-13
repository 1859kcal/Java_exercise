package exercise27;

public class Main {

	 public static void main(String[] args) {
	        int[] nums = { 1, 2, 3, 4 };

	        System.out.println(averageOfArray(nums)); // 2.5と表示
	    }

	 // averageOfArrayを作成
	 public static double averageOfArray(int[] arr) {
		double sum = 0.0;

		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		double ave = sum / arr.length;
		return ave;

	}
}
