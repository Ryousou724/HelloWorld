public class ArrayExercise01{
	public static void main(String[] args) {
		//创建一个char类型26个元素，放置‘A'-‘Z’，使用for循环访问所有元素并打印
		//提示：char类型数据运算‘A'+1 -》‘B’
		char[] chars = new char[26];
		for(int i = 0; i < chars.length; i++) {
			chars[i] = (char)('A' + i);
		}
		System.out.println("===chars数组===");
		for(int i = 0; i < chars.length; i++) {
		System.out.print(chars[i] + " ");
		}	
	}
}	