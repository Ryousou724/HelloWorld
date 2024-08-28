import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args) {
		/*参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则淘汰
		 * 并根据提示进入女子组和男子组
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入该歌手的成绩");
		double score = myScanner.nextDouble();
		if(score > 8.0) {
		System.out.println("请输入性别");
		char gender = myScanner.next().charAt(0);
		if(gender == '男') {
		System.out.println("进入男子组");
		}else if (gender == '女'){
		System.out.println("进入女子组");
		}else {
		System.out.println("性别输入错误");
		}
		}else {
		System.out.println("Sorry,out!");
		}
	}
}