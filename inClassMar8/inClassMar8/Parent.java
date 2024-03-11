package inClassMar8;

public abstract class Parent {
	public int value;
	
	public Parent() {
		this.value=20;
	}
	
	public void showValue() {
		System.out.println(this.value);
	}
	
	public abstract void printSomething();

}
