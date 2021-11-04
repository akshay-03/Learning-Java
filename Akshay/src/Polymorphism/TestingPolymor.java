package Polymorphism;

public class TestingPolymor {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.eat(a1); // Animal class eating method

		Dog d1 = new Dog();
		d1.eat(d1); // Dog class eating method

		Cat c1 = new Cat();
		c1.eat(d1); // animal class eating method

		Animal d2 = new Dog();
		d2.eat(d2); // Dog class eating method
		Animal c2 = new Cat();
		c2.eat(d2); // ANIMAL CLASS EATING METHOD
	}
}

class Animal {
	
		

	protected Animal eat(Animal a) {
		System.out.println("Animal is eating");
		//new Animal();
		
		return new Animal();
	}
}

class Dog extends Animal {

	protected Dog eat(Animal a) {
		System.out.println("This is dog's specific method");
		return new Dog();
	}

	public void dogwaytoEat() {

		System.out.println("This is dog's specific method");
	}

}

class Cat extends Animal {

	public void catwaytoEat() {

		System.out.println("This is cat's specific method");
	}

}
