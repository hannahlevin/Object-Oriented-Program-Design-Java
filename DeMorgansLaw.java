
public class DeMorgansLaw {
	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		int a = 10;
		int b= 3;
		int g = 2;
		int i = 10;
		int j = 6;
		System.out.println(!(x <5) && ! (y >= 7));
		System.out.println(! (x < 5) || ! (y >= 7));
		System.out.println();
		System.out.println(!(a == b) || !(g != 5));
		System.out.println(!((a == b) && (g != 5)));
		System.out.println();
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println(!(x <= 8) || !(y > 4));
		System.out.println();
		System.out.println(!((i > 4) || (j <= 6)));
		System.out.println(!(i > 4) && !(j <= 6));


	}
}