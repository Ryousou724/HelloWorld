public class ForceConvertDetail{
	public static void main(String[] args) {
		
		//强转符号只针对最近的操作数有效，会使用小括号提升优先级
		//int x =(int)10 * 3.5 +6*1.5//wrong
		int x =(int)(10 * 3.5 +6*1.5);//(int)44.0
		System.out.println(x);
		
		//char类型可以表示int常量值，但是不能表示变量值
		char c1 = 100;
		System.out.println(c1);
		int m = 100;
		char c3 =(char)m;
		System.out.println(c3);//100对应的字符
	}
}
