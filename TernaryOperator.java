public class TernaryOperator{
	public static void main(String[] args) {
		
		int a = 10;
		int b = 99;
		int result = a > b ? a++ : b-- ;
		//a > b is false, so --> b--
		System.out.println(result);//先赋值，后自减少
	}
}