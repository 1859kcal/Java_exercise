package array;

public class Mondai4 {

	public static void main(String[] args) {
		int[] kakezan= {1,2,3,4,5,6,7,8,9};
		int k; //計算式格納
		int len; //桁数判定用

		//段下げ
		for(int i=kakezan.length-1; i>0; i--) {

			//iの段計算
			for(int j=1; j<=kakezan.length; j++) {
				k=kakezan[i]*j;
				len=String.valueOf(k).length();

				//桁数判定
				if(len==1) {
					System.out.print(" ");
				}
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
