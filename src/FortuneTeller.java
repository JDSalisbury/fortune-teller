import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("What is your first name? ");
		String firstName = input.nextLine();

		System.out.print("What is your last name? ");
		String lastName = input.nextLine();

		System.out.print("What is your Age? ");
		int age = input.nextInt();

		System.out.print("What is your Birth Month(for January please enter 1, for December please enter 12)? ");
		int birthMonth = input.nextInt();
		input.nextLine();
		System.out.print("What is your Favorite ROYGBIV Color? ");
		String color = input.nextLine().toLowerCase();

		System.out.print("How many Siblings do you have? ");
		int siblings = input.nextInt();

		// Retirement Years

		int retirement = age;
		if (age % 2 == 0) {
			retirement = 40;
		} else {
			retirement = 60;
		}

		System.out.println(retirement);

		// vacation destination
		String vacation;
		if (siblings == 1) {
			vacation = "Toronto, Canada";
		} else if (siblings == 2) {
			vacation = "Portland, Oregon";
		} else if (siblings == 3) {
			vacation = "Chernobyl, Ukraine";
		} else if (siblings > 3) {
			vacation = "Detroit, Michigan";
		} else {
			vacation = "Columbus, Ohio";
		}
		System.out.println(vacation);
		
		// Vehicle
		String vehicle;
		if (color.equals("red")) {
			vehicle = "Bike";
		}else if(color.equals("orange")) {
			vehicle = "Hand Glider";
			
		}else if(color.equals("yellow")) {
			vehicle = "Roller Blades";
		}else if(color.equals("green")) {
			vehicle = "Horse";
		}else if(color.equals("blue")) {
			vehicle = "Imagination via cape";
		}else if(color.equals("indigo")) {
			vehicle = "Rainbows, work on your rain dance";
		}else if(color.equals("violet")) {
			vehicle = "Sedan Chair";
		}else {
			System.out.println("Please enter red, orange, yellow, green, blue, indigo, or violet.");
		}
		
	}

}
