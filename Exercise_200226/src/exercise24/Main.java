package exercise24;

public class Main {

	public static void main(String[] args) {
        int diff1 = diff(5, 2);
        System.out.println(diff1); // 3と表示

        int diff2 = diff(2, 5);
        System.out.println(diff2); // 3と表示
    }

    //diffメソッドを作成
	public static int diff(int i1 , int i2) {
		int diff = i1 - i2;
		if(i1<i2) {
			diff = i2 - i1;
		}
		return diff;
	}

}
