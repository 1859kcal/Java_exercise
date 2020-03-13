package usesclass;

public class Mondai2 {

	public static void main(String[] args) {
		String gender=new String("男");
		if(gender.equals("男")) {
			System.out.println("私は男性です。");
		}else if (gender.equals("女")) {
			System.out.println("私は女性です。");
		}else {
			System.out.println("私は男性でも女性でもありません。");
		}
	}
}
