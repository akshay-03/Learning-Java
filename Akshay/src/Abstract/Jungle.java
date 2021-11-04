package Abstract;

public class Jungle { 
	
	public static void main(String[] args) {
		
	//		Animal animal = new Animal();   we can't create an object 
		//of abstract class because there is a 
		//possibility/ambiguity that an abstract function 
		//might contain an abstract method
		
			Animal animal = new SmallCat();
			animal.show();
	}

}
