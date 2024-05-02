
public class Main {

	public static void main(String[] args) {
		 
		//method overriding = > declaring a method in a sub class,
		// 					    which is already present in a parent class
		// 					    done so that a child class can give its own implementation
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		dog.speak();
		animal.speak();
		
		
	}

}
