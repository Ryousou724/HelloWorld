//演示转义字符的使用
public class ChangeChar{
	public static void main(String[] args) {
		//\t:一个制表位，实现对齐功能
		System.out.println("北京\t天津\t上海");
		//\n:换行符
		System.out.println("jack\nsmith\nmary");
		//\\:一个\
		System.out.println("C:\\Windows\\System32");
		System.out.println("C:\\\\Windows\\\\System32");
		//\":一个"
		System.out.println("社长说:\"要好好学习！\"");
		//\':一个'
		System.out.println("社长说:\'要好好学习！\'");
		//\r:一个回车 System.out.println("韩顺平教育\r北京")
		System.out.println("韩顺平教育\r北京");
		System.out.println("韩顺平教育\r\n北京");
		
		System.out.println("书名\t作者\t价格\t销量\r三国\t罗贯中\t120\t1000");
	}
}