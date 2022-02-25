package application;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		/*
		*Scanner scanner = new Scanner(System.in);
		*int value = 0;
		
		*System.out.println("Enter a number > ");
		*String line = scanner.nextLine();
		*/
		/*
		try {
			value = Integer.parseInt(line);
			/* if parseInt throws an exception, the program immediately
			 * jumps to the catch block and doesn't execute anything 
			 * below in the try block
			 */
		/*
			System.out.println("You entered: " + value);
		}
		catch (NumberFormatException e){
			System.out.println("That is an invalid input.");
		}
		*/
		//scanner.close();
	
		getNumber();
	}
	
	private static int getNumber() {
		Scanner scanner2 = new Scanner(System.in);
		int value2 = 0;
		System.out.println("Enter a number please: ");
		String line2 = scanner2.nextLine();
		try {
			value2 = Integer.parseInt(line2);
			System.out.println("You entered: " + value2);
		}
		catch(NumberFormatException e) {
			System.out.println("Not a number");
			getNumber();
		}
		scanner2.close();
		return value2;
	}
}
