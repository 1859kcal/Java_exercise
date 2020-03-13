package exercise7_1;

public class Dog {

	private String Type;
	private String Name;
	private int Age;

	public Dog() {
		Type = "不明";
	}

	public Dog(String t) {
		Type = t;
	}

	public void setName(String n) {
    	Name = n;
    }

	public void setAge(int a) {
		Age = a;
	}

    public void showProfile() {
    	System.out.println( "犬種：" + Type);
    	System.out.println( "名前：" + Name);
    	System.out.println( "年齢：" + Age);
    	System.out.println();
    }

}
