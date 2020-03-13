package exercise44;

public class Main {

	public static void main(String[] args) {
		int[] nums = {5,6,7,8,9,10};
		int sum = 0;
		double ave = 0;
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
		}

		double dSum = (double)sum;
		ave = dSum / nums.length;

		System.out.println("合計：" + sum);
		System.out.println("平均：" + ave);
	}

}
