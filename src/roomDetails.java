import java.util.Scanner;

public class roomDetails {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to Grand Circus' Room Detail Generator!" + "\n");

		
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		// while to check if app should continue
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// prompt for room length
			System.out.print("Enter Length: ");

			// get length input and convert to double
			float length = Float.parseFloat(input.nextLine());

			// prompt for room width
			System.out.print("Enter Width: ");

			// get width of room and convert to double
			float width = Float.parseFloat(input.nextLine());

			// calculate and display area
			float area = length * width;
			System.out.println("Area: " + area);

			// calculate and display perimeter
			float perimeter = 2 * (length + width);
			System.out.println("Perimeter: " + perimeter + "\n");

			// ask to continue
			System.out.print("Continue? (y/n):");
			choice = input.nextLine();

		}
		//close scanner
		input.close();
	}
}
