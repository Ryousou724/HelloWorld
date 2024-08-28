import java.util.Scanner;
public class Switch01{
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入一个字符(a-g)");
		char c1 = myScanner.next().charAt(0);
		switch (c1) {
		case 'a':
			System.out.println("Monday");
		break;
		case'b':
			System.out.println("Tuesday");
		break;
		case'c':
			System.out.println("Wednesday");
		break;
		case'd':
			System.out.println("Thursday");
		break;
		case'e':
			System.out.println("Friday");
		break;
		case'f':
			System.out.println("Saturday");
		break;
		case'g':
			System.out.println("Sunday");
		break;
		default:
			System.out.println("Wrong!");
		}
		System.out.println("Out Switch");
	}
}