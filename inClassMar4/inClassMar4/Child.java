package inClassMar4;

public class Child extends Parent{
	public int value;
	public String str;

	public Child() {
		super("help");
		this.mom="Mary";
	}
	
	public void showMessage() {
		System.out.printf("%s\n", str);
	}
	
	public void eat() {
		super.eat();
		System.out.printf("Child Eating\n");
	}
}