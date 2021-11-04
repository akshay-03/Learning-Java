package Interfaces;

public class SmallCat implements Cat, Junglee {
	
	// a subclass can implement two different classes
	// as the implementations of abstract functions will be
	// in the child class itself and there will be no ambiguity
	// as there are no concrete functions in interfaces

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

}
