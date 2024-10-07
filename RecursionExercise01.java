public class RecursionExercise01{
	public static void main(String[] args) {
		TT t1 = new TT();
		int n = -1;
		int res = t1.fibonacci(-1);
		if(res != -1) {
		System.out.println("当n=" + n + "对应的斐波那契数=" + res);
		}
	}
}
class TT{
	//用递归的方式求出斐波那契数1，1，2，3，5，8，13。。。，给你一个整数n，求出他的值
	public int fibonacci(int n) {
		if(n >= 1) {
			if(n == 1 || n == 2) {
				return 1;
			}else {
				return fibonacci(n-1) +fibonacci(n-2);
			}
		}else {
			System.out.println("要求输入的n>=1的整数");
			return -1;
		}
	}
}