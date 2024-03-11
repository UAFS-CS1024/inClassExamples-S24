package inClassMar8;

public class Child extends Parent implements Printable{

	@Override
	public void printSomething() {
		System.out.println("Something");
		
	}

	@Override
	public void showMessage() {
		System.out.println("Message");
		
	}

}
