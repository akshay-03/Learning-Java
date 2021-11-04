package Inheritance;

public class Super_Keyword {

	
	int maxSpeed = 100;
	
	public static void main(String[] args) {
		
		
		Car small = new Car();
		small.display();
	}

}
class Car extends Super_Keyword {
		
		int maxSpeed = 180;
		
		void display() {
			System.out.println("The speed of the car is: " + super.maxSpeed);
			
		}
	
}


