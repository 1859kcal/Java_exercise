package javaclass;

public class Mondai6 {

	public static void main(String[] args) {
		MaterialManager m1 = new MaterialManager();
		MaterialManager m2 = new MaterialManager();

		m1.setMouse(3);
		m1.setKeyboard(4);
		m1.setHardDisk(7);
		m1.setDispray(12);

		System.out.println("--------- 管理１の各資材数は以下の通りです。 ------");
		System.out.println("マウスの数は"+m1.getMouse()+"個です。");
		System.out.println("キーボードの数は"+m1.getKeyBoard()+"個です。");
		System.out.println("ハードディスクの数は"+m1.getHardDisk()+"個です。");
		System.out.println("ディスプレイの数は"+m1.getDispray()+"個です。");
		System.out.println("--------- 管理２の各資材数は以下の通りです。 ------");
		System.out.println("マウスの数は"+m2.getMouse()+"個です。");
		System.out.println("キーボードの数は"+m2.getKeyBoard()+"個です。");
		System.out.println("ハードディスクの数は"+m2.getHardDisk()+"個です。");
		System.out.println("ディスプレイの数は"+m2.getDispray()+"個です。");
		System.out.println();

		m2.setMouse(6);
		m2.setKeyboard(8);
		m2.setHardDisk(15);
		m2.setDispray(17);

		System.out.println("--------- 管理１の各資材数は以下の通りです。 ------");
		System.out.println("マウスの数は"+m1.getMouse()+"個です。");
		System.out.println("キーボードの数は"+m1.getKeyBoard()+"個です。");
		System.out.println("ハードディスクの数は"+m1.getHardDisk()+"個です。");
		System.out.println("ディスプレイの数は"+m1.getDispray()+"個です。");
		System.out.println("--------- 管理２の各資材数は以下の通りです。 ------");
		System.out.println("マウスの数は"+m2.getMouse()+"個です。");
		System.out.println("キーボードの数は"+m2.getKeyBoard()+"個です。");
		System.out.println("ハードディスクの数は"+m2.getHardDisk()+"個です。");
		System.out.println("ディスプレイの数は"+m2.getDispray()+"個です。");
	}

}
