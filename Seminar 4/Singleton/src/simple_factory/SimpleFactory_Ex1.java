package simple_factory;

public class SimpleFactory_Ex1 {
}
	
	//Product interface
	interface Animal{
		void sound();
	}
	
	// Concrete product 1
	class Dog implements Animal{
		@Override
		public void sound() {System.out.println("Woof");}
	}
	
	// Concret product 2 
	class Cat implements Animal {
		@Override
		public void sound() {
			System.out.println("Meow");
		}
	}
	
	// Simple factory
	class AnimalFactory{
		public static Animal createAnimal(String type) {
			if("Dog".equalsIgnoreCase(type)) {
				return new Dog();
			} else if ("Cat".equalsIgnoreCase(type)) {
				return new Cat();
			} else {
				throw new IllegalArgumentException("Invalid animal type");
			}
		}
	}
	
	//Client code
	class MainEx1 {
		public static void main(String[] args) {
			Animal dog = AnimalFactory.createAnimal("Dog");
			dog.sound();
			
			Animal cat = AnimalFactory.createAnimal("Cat");
			cat.sound();
		}
	}


