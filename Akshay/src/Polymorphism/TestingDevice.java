package Polymorphism;

import java.util.Scanner;

public class TestingDevice {

	
		public void ringing(Device d) {
			
			d.ringing();
		}
		
		public void vibrations(Device d) {
			
			d.vibrations();
		}
		
		public static void main(String[] args) {
			
			TestingDevice test = new TestingDevice();
			Mobile mobile = new Mobile();
			Laptop lappy = new Laptop();
			Watch watch = new Watch();
			Television tv = new Television();
			
			Scanner scan = new Scanner(System.in);
			int select = scan.nextInt();
			
			switch(select) {
			
			case 1:
				test.ringing(mobile);
				test.ringing(lappy);
				break;
			case 2:
				test.ringing(tv);
				test.ringing(lappy);
				test.vibrations(tv);
				break;
			case 3:
				test.ringing(watch);
				test.vibrations(lappy);
				break;
			default:
				System.out.println("Do nothing");
			}
			
			
		}
}


class Device{
	
	
	public void ringing() {
		
		System.out.println("This is standard ringing process");
	}
	
	public void vibrations() {
		
		System.out.println("This is standard vibrating process");
	}
}


class Mobile extends Device {
	
	
public void ringing() {
		
		System.out.println("This is mobile's ringing process");
	}
	
	public void vibrations() {
		
		System.out.println("This is mobiles's vibrating process");
	}

}

class Laptop extends Device {
	
	
public void ringing() {
		
		System.out.println("This is laptop's ringing process");
	}
	
	public void vibrations() {
		
		System.out.println("This is laptop's vibrating process");
	}

}



class Watch extends Device {
	
	
public void ringing() {
		
		System.out.println("This is watch's ringing process");
	}
	
	public void vibrations() {
		
		System.out.println("This is watch's vibrating process");
	}

}


class Television extends Device {
	
	

	public void vibrations() {
		
		System.out.println("This is watch's vibrating process");
	}

}








