
import java.util.Scanner;
public class Test3 {
	public static void main(String[] args) {
		int choice = 2;
		switch (choice) {

		case 1: System.out.print( "You chose 1");
		case 2: System.out.print( "You chose 2");
		case 3: System.out.print( "You chose 3");

		System.out.println();

		int number1 = 0;
		int number2 = 0;
		switch (number1 + 1) {
			case 0: number2 = 0;
			case 1: number2 = 1;
			default: number2 = -1;
		}

		System.out.println(number2);

		}

		System.out.println();
		System.out.println();
		//for (int counter = 10; counter > 0; counter--);
			//System.out.printf("%d", counter);
		System.out.println();
		System.out.println();
		//System.out.println("Enter a number 1-50");
		//Scanner input = new Scanner(System.in);
		//int value = input.nextInt();

		//if (value < 1 && value > 50)
			//System.out.println("Your value is out of range");
		//for (int count = 5; count >0; count++)
			//System.out.println(count);
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;

		System.out.println(n1 >= 1 && n3 <= n4);
		System.out.println(n4 == 1 || n3 > n4);






	}
}