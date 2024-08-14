public class AutoConverDetail{
	public static void main(String[] args) {
		
		//细节1：有多种类型的数据运算时，系统首先将所有数据转换成容量最大的那种数据类型，然后再运算
		int n1 = 10; //ok
		//float d1 = n1 + 1.1; wrong
		//double d1 = n1 + 1.1;ok
		float d1= n1 +1.1f;
		System.out.println(d1);
		
		//细节2:当我们把精度大的数据类型 赋值给精度小的数据类型时，就会报错，反之则进行自动类型转换。
		//int n2 = 1.1;//wrong 
		
		//细节3:(byte short)和char之间不会相互自动转换
		byte b1 = 10;//ok
		System.out.println(b1);
		//char c1= b1;//wrong  byte不能自动转成char
		
		//细节4:byte short char它们三者可以计算，在计算时首先转换成int类型
		byte b2 = 1;
		//byte b3 = 2;
		short s1 = 1;
		//short s2 =b2 + s1;//wrong,b2 + s1 --> int
		int s2 =b2 + s1;
		//byte b4 = b2 + b3;//wrong, int
		System.out.println(s2);
		
		//细节5:布尔类型不参与转换
		
		
		
	}
}