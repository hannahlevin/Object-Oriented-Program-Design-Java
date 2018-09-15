// Hannah Levin
// I have not cheated or plagiarized on this program.

import java.util.Scanner; // class uses class Scanner

public class SalesCommission {
	public static void main(String[] args) {
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// prompt for input and read number from user
		System.out.print("Enter salesperson's name: ");
		String name = input.nextLine();
		
		int counter = 1;
		double totalSales = 0;
		double sales = 0;

		while (counter <= 5) {
			// prompt user for input and obtain value from user
			System.out.printf("Enter day %d sales: ", counter);
			sales = input.nextDouble();

			if (sales <= 0) {
			}
			else {
			totalSales = totalSales + sales;
		}

			// increment counter by one
			counter++;

		}

		double pay = 400.00 + (15.00 /100.00) * totalSales;
		// fixed above line from sales to totalSales 

		System.out.printf("%n%s earned $%.2f%n", name, pay);
		
		// display my name in the output
		System.out.printf("%nProgrammed by Hannah Levin%n%n");
	}
}