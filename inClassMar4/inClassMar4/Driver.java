package inClassMar4;

public class Driver {

	public static void main(String[] args) {
		Child c1 = new Child();
		
		c1.value=5;
		c1.str="Hello";
		
		c1.showMessage();
		c1.eat();
		System.out.printf("%s %s\n", c1.mom,c1.dad);
		

	}

}
