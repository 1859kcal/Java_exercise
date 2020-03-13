package javabasic;

public class Test2 {

	public static void main(String[] args) {

		int[] seisu= {3,6,9,1,5,8};
		int versus[]=new int[6];

		System.out.print("配列の値：");
		for(int k=0; k<=seisu.length-1; k++) {
			System.out.print(seisu[k]+" ");
		}

		for(int i=0; i<=seisu.length-1; i++) {
			for(int j=0; j<=seisu.length-1; j++) {
				if(seisu[i]>seisu[j]) {
					versus[i]+=1;
				}
			}
			if(versus[i]==5) {
				System.out.println("最大値は"+seisu[i]);
			}
		}
	}

}
