public class LogicOperator02{
	public static void main(String[] args) {
		
		// ||短路或
		int age = 50;
		if(age > 20 || age < 30) {
			System.out.println("ok100");
		}
		//｜逻辑或
		if(age > 20 | age < 30) {
		    System.out.println("ok200");
		}
		//区别
		int a = 4;
		int b = 9;
		if(a > 1 || ++b > 4) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + "b=" + b);
	}
}