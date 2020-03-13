package exercise8_1;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
	    Animal[] arr = new Animal[4];

	    arr[0] = new Dog();
	    arr[1] = new Cat();
	    arr[2] = new Dog();
	    arr[3] = new Cat();


		cat.Name = "Tama";
		cat.Age = 7;

		dog.Name = "Pochi";
		dog.Age = 9;

		cat.ShowProfile();
		cat.sleep();
		cat.speak();

		dog.ShowProfile();
		dog.run();
		dog.speak();

	}

}
