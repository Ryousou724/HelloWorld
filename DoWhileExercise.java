public class DoWhileExercise{
	public static void main(String[] args) {
		
		//打印1-100
		//计算1-100的和
		
		int i = 1;
		int sum = 0;
		do {
			System.out.println("i=" + i);
			i++;
			sum = sum + i;
		}while(i <= 100);
		
		System.out.println("sum=" + sum);
	}
}