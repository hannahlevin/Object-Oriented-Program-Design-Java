// Hannah Levin
// hannahlevin@my.smccd.edu
// CIS 254 ON
// SodaPop.java
// While loop printing numbers and words depending if they are divisible by 3, 5, or both Java program
// Lab 3
// 7-2-2018
// I have not cheated or plagiarized on this assignment.

public class SodaPop {
	public static void main(String[] args) {

		int number = 1; // declare and initialize number

		while (number <= 100) { // while loop to print 100 of int number depending with what is inside the loop

			if (number % 3 == 0) {
				if (number % 5 == 0) {
					System.out.printf("%5s", "*SP*");
				}

			else {

				System.out.printf("%5s", "Soda");

					}
			}

				else if (number % 5 == 0) {
				System.out.printf("%5s", "Pop");
			}

				else {
				System.out.printf("%5d", number);

			}

			if (number % 10 == 0) {

				System.out.println();
			}


				number = number + 1;
		}

		System.out.printf("%nProgrammed by Hannah Levin%n");
	}
}