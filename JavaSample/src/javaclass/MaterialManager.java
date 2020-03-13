package javaclass;

public class MaterialManager{
	int mouse;
	int keyBoard;
	static int hardDisk;
	static int dispray;

	MaterialManager() {
		mouse=5;
		keyBoard=5;
	}

	MaterialManager(int tMouse,int tKeyBoard) {
		mouse=tMouse;
		keyBoard=tKeyBoard;
	}

	void setMouse(int tMouse) {
		mouse=tMouse;
	}

	void setKeyboard(int tKeyboard) {
		keyBoard=tKeyboard;
	}

	 void setHardDisk(int tHardDisk) {
		hardDisk=tHardDisk;
	}

	void setDispray(int tDispray) {
		dispray=tDispray;
	}

	int getMouse() {
		return mouse;
	}

	int getKeyBoard() {
		return keyBoard;
	}

	static int getHardDisk() {
		return hardDisk;
	}

	static int getDispray() {
		return dispray;
	}

}