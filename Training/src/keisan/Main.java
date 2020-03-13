package keisan;

//親クラス
class SuparClass{

	//メンバ変数
	protected int i1;
	protected int i2;

	//メンバメソッド
	void plusMethod (int i1 , int i2) {
		this.i1 = i1;
		this.i2 = i2;
		System.out.println("i1 + i2 = "+(i1+i2));
	}
}

class SubClass extends SuparClass{
	private int i3;
	private int i4;

	void plusMethod2(int i3 , int i4) {
		this.i3 = i3;
		this.i4 = i4;
		System.out.println("i3 + i4 = "+(this.i3 + this.i4));
	}
}

class SubSubClass extends SubClass{
	private int i5;
	private int i6;

	void plusMethod3(int i5 , int i6) {
		this.i5 = i5;
		this.i6 = i6;
		System.out.println("i5 + i6 = "+(this.i5 + this.i6));
	}
}

public class Main {

	public static void main(String[] args) {
		SuparClass sc1 = new SuparClass();
		sc1.plusMethod(3 , 4);

		SubClass sc2 = new SubClass();
		sc1.plusMethod (3 , 4);
		sc2.plusMethod2(4 , 5);

		SubSubClass sc3 = new SubSubClass();
		sc1.plusMethod (3 , 4);
		sc2.plusMethod2(4 , 5);
		sc3.plusMethod3(2 , 6);

	}

}
