package exercise45;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		intArray.add(3);
		intArray.add(4);
		intArray.add(5);
		intArray.add(6);

		int sum = 0;
		int min = intArray.get(0);
		int max = intArray.get(0);

		for(int num : intArray) {
			sum += num;
			if(num > max) {
				max = num;
			}else if(num < min) {
				min = num;
			}
		}

		double ave = sum / intArray.size();

		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + ave);
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}

}
