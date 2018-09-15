public class OperatorPrecedenceTesting {
	public static void main(String[] args) {

		int s = 20; 
		int a = s++;
		//s = 20;
		int b = --s;
		//int t = s++ + --s;


		System.out.println(a);
		System.out.println(b);
		//System.out.println(t);

	}

}
