public class WhileExercise01{
	public static void main(String[] args) {
		//打印40-200之间所有偶数
		
		int i = 40;
		while(i >= 40 && i <= 200) {
			if(i % 2 == 0) {
			System.out.println("i=" + i);
			}
			i++;
		
		
		}	
	}
}