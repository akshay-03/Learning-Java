package Abstract;


//public class SmallCat extends Cat,Animal
// this is not possible because there can be a same concrete function 
// in both the parent classes,and the child class will not be able
// to determine/ambiguity which method it has to call
public class SmallCat extends Cat{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void talk() {
		// TODO Auto-generated method stub
		
	}
	
	

}
