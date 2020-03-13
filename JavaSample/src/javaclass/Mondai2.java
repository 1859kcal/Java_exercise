package javaclass;

public class Mondai2 {

	public static void main(String[] args) {
		MaterialManager m = new MaterialManager();

		m.setMouse(2);
		m.setKeyboard(4);

		System.out.println("マウスの数は"+m.getMouse()+"個です。");
		System.out.println("キーボードの数は"+m.getKeyBoard()+"個です。");
	}

}
