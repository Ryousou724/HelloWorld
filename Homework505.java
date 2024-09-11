public class Homework505{
	public static void main(String[] args) {
		//求出1 - 1/2 + 1/3 - 1/4 ....1/100的和
		double sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {  //分母为基数
				sum += 1.0/i;
			}else {         //分母为偶数
				sum -= 1.0/i;
			}
		}
		System.out.println("sum=" + sum);
	}
}	