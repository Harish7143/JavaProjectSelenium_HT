package practiceJava;

public class DoWhileloop {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i >10);
		System.out.println("outside do while loop");

		while (i > 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("out of the while loop");
	}
}
