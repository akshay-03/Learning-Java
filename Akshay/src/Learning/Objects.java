package Learning;

public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double vol;
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		mybox1.width = 10;
		mybox1.height = 15;
		mybox1.depth = 20;
		
		mybox2.width = 3;
		mybox2.height = 5;
		mybox2.depth = 10;
		
		vol = mybox1.depth * mybox1.height * mybox1.width;
		System.out.println("Volume of Box 1 is: " + vol);
		
		vol = mybox2.depth * mybox2.height * mybox2.width;
		System.out.println("Volume of Box 2 is: " + vol);
		
		

	}
}

	
	class Box {
		
		double width;
		double height;
		double depth;
	}

