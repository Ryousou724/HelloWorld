import java.util.Scanner;
public class BreakExercise02{
	public static void main(String[] args) {
	
	//验证登陆信息，有三次机会，如果用户名为“Ryousou”，密码“666”提示登陆成功
	//否则提示还有几次机会，使用for+break完成
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;
		for(int i = 1; i <= 3;i++) {
			System.out.println("请输入用户名");
			name = myScanner.next();
			System.out.println("请输入密码");
			passwd = myScanner.next();
			
			if("Ryousou".equals(name) && "666".equals(passwd)) {
				System.out.println("恭喜你！登陆成功");
				break;
			}
				chance--;
				System.out.println("你还有" + chance + "次登陆机会");
		}
		
		
	}
}