public class TernaryOperatorExercise{
	public static void main(String[] args) {
		
		//实现三个数的最大值
		int n1 = 255;
		int n2 = 33;
		int n3 =123;
		
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大数是=" + max2);
		
		//用一句话实现
		int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.println("最大数是=" + max);
	}
}