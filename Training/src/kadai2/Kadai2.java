package kadai2;

public class Kadai2 {
	public static void main(String[] args){

        Arithmetic math = new Arithmetic();     //クラスのインスタンス生成

        int sum = math.add(1,2);                //インスタンスのメソッドを呼び出す

        System.out.println("1 + 2 = "+sum);
    }
}
