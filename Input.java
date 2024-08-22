import java.util.Scanner;//把java.util下的Scanner类倒入
public class Input{
	public static void main(String[] args) {
		
		//演示接受用户输入
		//步骤1：引入Scanner类所在的包，Scanner类表示简单的文本扫描器
		//步骤2: 创建Scanner对象,new = 创建
		Scanner myScanner = new Scanner(System.in);
		//步骤3:接受用户输入
		System.out.println("请输入名字");
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();
		System.out.println("人的信息如下");
		System.out.println("名字=" + name + "年龄=" + age + "薪水=" + sal);
		
	}
}