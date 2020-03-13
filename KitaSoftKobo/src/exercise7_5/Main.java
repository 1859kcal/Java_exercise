package exercise7_5;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		CoinCase coinCase = new CoinCase();
		Random random = new Random();
		int i = 0;
		int[] type = {1,5,10,50,100,500};

		while(i<1000) {
			int t = 0;
			int n = 0;
			t = random.nextInt(type.length);	//typeの配列番号用
			n = random.nextInt(20) + 5;			//追加する枚数
			coinCase.addCoins(type[t], n);
			i++;
		}

		for(int x=0; x<type.length; x++) {
			int s = type[x];
			System.out.println(s + "円硬貨：" + coinCase.getCount(s) + "枚");
		}

		System.out.println("合計金額は" + coinCase.getAmount() + "円です");
	}

}
