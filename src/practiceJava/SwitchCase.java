package practiceJava;

public class SwitchCase {

	public static void main(String[] args) {
		int day = 8;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wedndesday");
			break;
		case 4:
			System.out.println("Thurday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("None of the case satisfied");
		}
	}
}
