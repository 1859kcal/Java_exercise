package array;

public class Mondai3 {

	public static void main(String[] args) {
		int[] seiseki= {40,20,75,100,39};
		String[] testUser = {"⽥中", "佐藤", "中沢", "吉本", "品川"};
		int pass=0;
		int failure=0;
		for(int i=0; i<=seiseki.length-1; i++) {
			if(seiseki[i]>=40) {
				pass++;
				System.out.println(testUser[i]+"さんは"+seiseki[i]+"点で合格です。");
			}else {
				failure++;
				System.out.println(testUser[i]+"さんは"+seiseki[i]+"点で不合格です。");
			}
		}
		System.out.println("合格："+pass+"人　不合格："+failure+"人");
	}

}
