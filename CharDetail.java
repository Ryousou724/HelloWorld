public class CharDetail{
	public static void main(String[] args) {
		
		//在java中，char的本质是一个整数，在默认输出时，是unicode码对应的字符
		//要输出对应的数字，可以（int）字符
		char c1 = 97;
		System.out.println(c1);//a
		
		char c2 = 'a';
		System.out.println((int)c2);//输出'a'对应的数字
		
		char c3 = '梁';
		System.out.println((int)c3);
		
		char c4 = 26753;
		System.out.println(c4);
		
		//char类型可以进行运算，相当于一个整数，因为都有对应的unicode码
		System.out.println('a' + 10);
		
		char c5 = 'b' + 1;
		System.out.println((int)c5);
		System.out.println(c5);
		
		
	}
}