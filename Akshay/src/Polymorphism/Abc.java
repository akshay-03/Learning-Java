package Polymorphism;

abstract class absC {
	public abstract void blabla();

	public abstract void show();

	public void low() {
		// blabla
	}
}

abstract class absB {
	public abstract void blabla();

	public abstract void show();

	public void low() {
		System.out.println("papa");

	}
}

interface ITIS {

	public int cl = 0;

	public void blabla();

	public void show();

}

public class Abc extends absB {

	public void low() {
		System.out.println("beta");
	}

	@Override
	public void blabla() {
		super.low();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Abc a = new Abc();
		a.blabla();
	}

}
