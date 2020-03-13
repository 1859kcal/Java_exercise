package exercise26;

public class Main {

	public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        int sum = sumOfArray(nums);
        System.out.println(sum); // 15と表示
    }

    // sumOfArrayメソッドを作成
	public static int sumOfArray(int[] arr) {
		int sum = 0;

		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
