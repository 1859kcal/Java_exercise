package Kadai5;

public class kadai5 {

	public static void main(String[] args) {
		String str = comp(3 , 6);
		System.out.println(str);
	}

	public static String comp(int i1 , int i2) {
		String value = "";
		if(i1<i2) {
			value = Integer.toString(i2)+"の方が大きい";
		}else if(i1>i2) {
			value = Integer.toString(i1)+"の方が大きい";
		}else if (i1 == i2) {
			value = "値は等しい";
		}

		return value;
	}

}
