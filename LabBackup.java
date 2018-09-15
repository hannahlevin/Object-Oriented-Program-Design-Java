// Hannah Levin
// hannahlevin@my.smccd.edu
// CIS 254 ON
// RandomArray.java
// Uses class SecureRandom and control statements to generate and print random numbers 1-100,
// 	print the duplicated numbers and their count, and print missing numbers that were not generated
// Assignment 6
// 7-24-2018
// I have not cheated or plagiarized on this assignment.

import java.security.SecureRandom; // class uses class SecureRandom

public class LabBackup {
	public static void main(String[] args) {

		// create SecureRandom object named randomNumbers
		SecureRandom randomNumbers = new SecureRandom();

		int [] numbers = new int[101]; // create an array of numbers
		int [] duplicates = new int[101]; // create an array of the count of duplicated numbers
		
		// randomly chooses a number 1-100, 100 times
		for (int choose = 1; choose <= 100; choose++) {

			numbers[choose] = 1 + randomNumbers.nextInt(100); // element of array of numbers is assigned a random number between 1-100
			++duplicates[numbers[choose]]; // increment the frequency element by one
		}

		System.out.printf("%nSorted Array%n"); // display header
		bubbleSort(numbers); // call static method bubbleSort with parameter of array numbers

		// print all of the chosen random numbers
		for (int counter = 1; counter < numbers.length; counter++) {

			System.out.printf("%4d" ,numbers[counter]);

			// a newline is printed every 10 numbers
			if (counter % 10 == 0) {

				System.out.println();
			}
		}

		System.out.printf("%n%s%10s%n", "Duplicate", "Count"); // display header

		// output each array element's value
		for (int repeat = 1; repeat < duplicates.length; repeat++) {

			// if a number was printed more than index once(index one is zero)
			if (duplicates[repeat] != 0) {

				System.out.printf("%4d%13d%n", repeat, duplicates[repeat]); // print each duplicated number and the count
			}

		}

		System.out.printf("%nMissing Numbers%n"); // display header

		// create an array with a number of elements that is the length of the number of elements from the numbers array
		int[] missing = new int[numbers.length];

		// for each element in the numbers array assign to 1
		for (int counter2 : numbers) {

			missing[counter2] = 1;
		}

		int totalMissing = 0; // declare and initialize totalMissing

		// counter controlled loop that repeats the length of the missing array, 100 times		
		for (int status = 1; status < missing.length; status++) {

			// if there are any elements that are 0, thus were not affected from the initialization to one in the code above
			if (missing[status] == 0) {

				System.out.printf("%4d", status); // print missing number
				totalMissing++; // increment totalMissing by one

				// a newline is printed every 5 missing numbers
				if (totalMissing % 5 == 0) {

					System.out.println();
				}
			}
		}

		System.out.printf("%n%nProgrammed by Hannah Levin%n%n"); // print my name
	}

	
	// sort elements of array with bubble sort 
	public static void bubbleSort( int [] data ) {
		// loop for data.length - 1 passes
		for ( int pass = 1; pass < data.length; pass++ ) {
			
			// loop over elements in array
			for ( int index = 0; index < data.length - 1; index++ ) {

				// swap adjacent elements if first is greater than second
				if ( data[ index ] > data[ index + 1 ] ) {
					int temporary = data[ index ]; // store in temporary
					data[ index ] = data[ index + 1 ]; // replace first
					data[ index + 1 ] = temporary; // replace second
				} // end if
			} // end inner for
		} // end outer for
	} // end method bubbleSort
}
