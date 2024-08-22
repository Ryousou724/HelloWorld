import java.util.Scanner;
public class If03{
	public static void main(String[] args) {
		
		/*输入小明芝麻信用分
		 * 如果：信用分为100分时，输出 信用极好；
		 *  信用分为（80，99】时，输出 信用优秀；
		 *  信用分为【60，80】时，输出 信用一般；
		 *  其他情况，输出 信用不及格
		 请键盘输出芝麻信用分，并加以判断
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入信用分");
		int grade = myScanner.nextInt();
		//有四种情况，所以使用多分枝
		if(grade >=1 && grade <= 100) {
		if(grade == 100) {
			System.out.println("信用极好");
		}else if(grade <= 99 && grade > 80) {
			System.out.println("信用优秀");
		}else if(grade >= 60 && grade <= 80) {
			System.out.println("信用一般");
		}else{
			System.out.println("信用不及格");
		}
		}else {
			System.out.println("信用分需要在1-100");
		}
		}
	}