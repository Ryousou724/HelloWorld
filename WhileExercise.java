public class WhileExercise{
	public static void main(String[] args) {
		//打印1-100之间所有能被3整除的数
		int i = 1;
		int endnum = 100;
		while(i <= endnum) {
			if(i % 3 ==0) {
			System.out.println("i=" + i);
	    }	
			i++;
		}
		
	}
}