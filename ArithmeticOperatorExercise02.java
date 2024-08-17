public class ArithmeticOperatorExercise02{
	public static void main(String[] args) {
		//第一题：假如还有59天放假，问：合**个星期零**天。
		int days = 59;
		int weeks = days / 7;
		int leftday = days % 7;
		System.out.println(days + "天合" + weeks + "星期" + 
		"零" + leftday + "天");
		
		//第二题：定义一个变量保存华氏温度，华氏温度转摄氏温度的公式为
		//5/9*（华氏温度-100），求出华氏温度对应的摄氏温度？【234.5】
		double HuaShi= 234.5;
		double SheShi = 5.0 / 9 * (HuaShi - 100);
		System.out.println(SheShi);
		
	    }
	}