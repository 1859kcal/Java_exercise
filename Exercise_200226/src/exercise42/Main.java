package exercise42;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Double> dArray= new ArrayList<Double>();
		dArray.add(1.1);
		dArray.add(2.2);
		dArray.add(3.3);

		ArrayList<Integer> iArray = new ArrayList<Integer>();

		for(double arr : dArray) {
			iArray.add((int)arr);

		}

		for(int arr : iArray) {
			System.out.println(arr);
		}

	}

}
