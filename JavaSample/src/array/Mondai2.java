package array;

public class Mondai2 {

	public static void main(String[] args) {
		int[] seiseki= {40,20,75,100,39};
		int pass=0;
		int failure=0;
		for(int i=0; i<=seiseki.length-1; i++) {
			if(seiseki[i]>=40) {
				pass++;
			}else {
				failure++;
			}
		}
		System.out.println("合格："+pass+"人　不合格："+failure+"人");
	}

}
