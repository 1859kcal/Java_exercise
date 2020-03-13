package exercise7_5;

public class CoinCase {
	private int Type;
	private int Num;
	private int[] Coin = new int[6];

	public void addCoins(int t , int n) {
		Type = t;
		Num = n;

		switch(Type) {
		case 1:
			Coin[0] = Num;
			break;
		case 5:
			Coin[1] = Num;
			break;
		case 10:
			Coin[2] = Num;
			break;
		case 50:
			Coin[3] = Num;
			break;
		case 100:
			Coin[4] = Num;
			break;
		case 500:
			Coin[5] = Num;
			break;
		default:
			System.out.println(Type + "円硬貨は存在しません");
		}
	}

	public int getCount(int t) {
		Type = t;

		switch(Type) {
		case 1:
			return Coin[0];
		case 5:
			return Coin[1];
		case 10:
			return Coin[2];
		case 50:
			return Coin[3];
		case 100:
			return Coin[4];
		case 500:
			return Coin[5];
		default:
			return 0;
		}
	}

	public int getAmount() {
		return 1*Coin[0]+5*Coin[1]+10*Coin[2]+50*Coin[3]+100*Coin[4]+500*Coin[5];
	}

}
