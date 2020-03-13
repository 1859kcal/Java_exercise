package javaclass;

public class Mondai5 {

	public static void main(String[] args) {
		MaterialManager m = new MaterialManager(3,4);

		m.setHardDisk(12);
		m.setDispray(10);

		System.out.println("マウスの数は"+m.getMouse()+"個です。");
		System.out.println("キーボードの数は"+m.getKeyBoard()+"個です。");
		System.out.println("ハードディスクの数は"+MaterialManager.hardDisk+"個です。");
		System.out.println("ディスプレイの数は"+MaterialManager.dispray+"個です。");
	}

}
