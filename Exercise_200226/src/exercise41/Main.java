package exercise41;

public class Main {

	public static void main(String[] args) {
		double[] d = {1.1,2.2,3.3};
		int[] num = new int[3];

		for(int i=0; i<d.length; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.println();

		for(int i=0; i<d.length; i++) {
			num[i] = (int)d[i];
		}

		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "　");
		}

	}

}
