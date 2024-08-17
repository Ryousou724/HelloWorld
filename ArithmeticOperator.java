public class ArithmeticOperator{
	public static void main(String[] args) {
		
		// 除法/的使用
		System.out.println(10 / 4);//2
		System.out.println(10.0 / 4);//2.5
		
		double d = 10 / 4;//数学中2.5 java中2，2--》2.0
		System.out.println(d);//2.0
		
		//取模 取余%的使用
		//取模的本质是 a % b = a - a / b * b
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);
		
		// ++使用
		int i = 10;
		i++;//11
		++i;//12
		System.out.println("i=" + i);
		
		int j = 8;
		//int k = ++j;//先增加后赋值 j=9 k = 9 
		int k = j++;// 先赋值后增加 j=9 k = 8
		System.out.println("j=" + j + "k=" + k);		
				
				
				
				
		
	}
}