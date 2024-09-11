public class Homework504{
	public static void main(String[] args) {
		//输出小写的a-z，以及大写的Z-A
		//考察a-z编码和for的总和使用
		for(char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1);
		}
		    System.out.println();
		for(char c1 = 'Z'; c1 >= 'A'; c1--) {
			System.out.print(c1);
		}
	}
}	