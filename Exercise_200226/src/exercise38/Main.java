package exercise38;

public class Main {

	public static void main(String[] args) {
		double d = 3.14;
		String dString = String.valueOf(d);
		String[] nums = dString.split("\\.");
		System.out.println(nums[0]);
	}

}
