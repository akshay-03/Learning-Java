package ControlStatements;

import java.util.Scanner;

public class DoWhile {
	
	
	public static void main(String[] args) throws java.io.IOException {
			int choice;
			
			do {
				System.out.println("What you'd like to have in menu? ");
				System.out.println(" 1. if");
				System.out.println(" 2. switch");
				System.out.println("Choose one:");
				Scanner sc = new Scanner(System.in);
				choice = sc.nextInt();
				System.out.println("The choice is: "+ choice);
			} while ( choice < 1 || choice > 2);
			
			System.out.println("\n");
			
			switch(choice) {
			case 1:
				System.out.println("This system is all about if statements");
				break;
			case 2:
				System.out.println("This system is all about");
				break;
			}
			
		}
	}


