public class IfExercise01{
	public static void main(String[] args) {
		
		//练习1：声明2个double型变量并赋值，判断第一个数大于10.0，且第二个数小于20.0，打印两数和
		double d1 = 15.5;
		double d2 = 17.8;
//		if(a > 10.0) {
//			if(b < 20.0) {
//				System.out.println(a + b);
//		}
		if(d1 >10.0 && d2 < 20.0) {
			System.out.println(d1 + d2);
			}
		
		//练习2:定义两个变量int，判断两者和，是否能被3和5整除，打印提示信息
		int num1 = 11;
		int num2 = 19;
		if(((num1 + num2) % 3 == 0 ) && ((num1 + num2) % 5 == 0 )) {
			System.out.println("可以整除");
		}else {
			System.out.println("不可以整除");
		}
		
		//练习3:半段年份是否是闰年，两条件符合其一（1）年份能被4整除，但不能被100整除 （2）能被400整除
		int year = 2024;
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println(year + "是闰年");
		}else {
			System.out.println(year + "不是闰年");
		}
	
	
		}
	}
	
