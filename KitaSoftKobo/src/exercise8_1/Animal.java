package exercise8_1;

public class Animal {
	public String Name;
    public int Age;

    public void ShowProfile(){
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }

    public void speak(){
        System.out.println( "......" );
    }

}
