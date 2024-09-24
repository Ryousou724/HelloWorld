import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
		//有一组数列：白眉鹰王 金毛狮王 紫衫龙王 青翼蝠王猜数游戏，
		//任意输入一个名称，判断数列中是否包含此名称【顺序查找】
		//要求：如果找到了，就提示找到，并给出下标值
		String[] name = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入名字");
		String findName = myScanner.next();
		//index 经典用法
		int index = -1;
		for(int i = 0; i < name.length; i++) {
			if(findName.equals(name[i])) {
				System.out.println("恭喜找到" + findName);
				System.out.println("下标为" + i);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("没有找到");
		}
	}
}	