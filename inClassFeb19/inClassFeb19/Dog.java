package inClassFeb19;

public class Dog {
	public String name;
	public String color;
	public String breed;
	private int age;
	
	public static int noDogs=0;
	
	public Dog() {
		Dog.noDogs++;
	}
	
	public Dog(String name, String breed, String color, int age) {
		noDogs++;
		this.name=name;
		this.breed=breed;
		this.color=color;
		this.setAge(age);
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age>=1 && age<=20) {
			this.age=age;
		}
	}
	
	public void bark() {
		System.out.printf("%s says Woof Woof\n",this.name);
	}
	
	public void eat() {
		System.out.printf("%s is Eating...\n",this.name);
	}
	
	public static void printNoDogs() {
		System.out.printf("NoDogs: %d\n", Dog.noDogs);
	}
}
