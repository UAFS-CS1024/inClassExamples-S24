package inClassFeb19;

public class Driver {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Spike","Bulldog","brown",5);
		Dog dog2 = new Dog();
		Dog dog3 = new Dog("Buddy","lab","black",7);
		
		
		dog1.bark();
		dog1.eat();
		
		dog2.name="Fido";
		dog2.breed="boxer";
		dog2.color="white";
		
		dog3.setAge(-5);
		System.out.printf("Age: %d\n", dog3.getAge());
		
		
		dog3.setAge(5);
		System.out.printf("Age: %d\n", dog3.getAge());
		
		dog3.name="Buddy";
		
		dog2.bark();
		dog2.eat();
		
		dog3.bark();
		dog3.eat();

		System.out.printf("NoDogs: %d\n", Dog.noDogs);
		System.out.printf("NoDogs: %d\n", dog1.noDogs);
		System.out.printf("NoDogs: %d\n", dog2.noDogs);
		System.out.printf("NoDogs: %d\n", dog3.noDogs);
		
		Dog.printNoDogs();
	}

}
