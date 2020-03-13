package exercise25;

public class Main {

	 public static void main(String[] args) {
	        int total = total(10);
	        System.out.println(total); // 55と出力
	    }

	    // totalメソッドを作成
	 public static int total(int x) {
		int sum = 0;
		for(int i=1; i<=x; i++) {
			sum += i;
		}
		return sum;
	}

}
