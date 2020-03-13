package exercise7_1;

public class Main {

	public static void main(String[] args) {
		Dog dog1 = new Dog("柴犬");
		dog1.setName("Pochi");
		dog1.setAge(12);
		dog1.showProfile();

		Dog dog2 = new Dog();
		dog2.setName("Taro");
		dog2.setAge(5);
		dog2.showProfile();
	}

}
