import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;

		
			String color = "";
			double base, height, side = 0;

			ArrayList<Shape> shapeList = new ArrayList<Shape>();
			
			while (choice != 3) {
				// 1. show the menu
				showMenu();


				// 2. get the user input
				System.out.println("Enter a number: ");
				choice = keyboard.nextInt();
				
			 

				// 3. DEBUG: Output what the user typed in
				System.out.println("You entered: " + choice);
				System.out.println();

				switch (choice) {

				case 1: 
					System.out.println("\nEnter color : ");
					color = keyboard.next();
					
					System.out.println("Enter Base : ");
					base = keyboard.nextDouble();
					System.out.println("Enter Height : ");
					height = keyboard.nextDouble();
					shapeList.add(new Triangle(side, color, base, height));
					System.out.println("data Saved\n");
					break;
				case 2: 
					System.out.println("\nEnter color : ");
					color = keyboard.next();
					
					System.out.println("Enter Side : ");
					side = keyboard.nextDouble();
					shapeList.add(new Square(side, color, side));
					System.out.println("data Saved\n");
					break;
				case 3: break;
				default:
					System.out.println("\n Wrong no. enter \n");}}

	}
	

	public static void showMenu() {
		System.out.println("AREA GENERATOR");
		System.out.println("==============");
		System.out.println("1. Triangle");
		System.out.println("2. Square");
		System.out.println("3. Exit");
	}

}



