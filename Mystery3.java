// 4.26 exercise in textbook
// Mystery3.java

public class Mystery3 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int k = 3;
		int m = 2;
		System.out.printf("%n%n%n%n");
		System.out.println(!(k > m));

		int row = 10;

		while (row >= 1) {
			int column = 1;

			while (column <= 10) {
				System.out.print(row % 2 == 1 ? "<" : ">");
				++column;
			}

			--row;
			System.out.println();
		}

	}
}