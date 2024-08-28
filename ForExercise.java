public class ForExercise{
	public static void main(String[] args) {
		//打印1-100之间所有是9的倍数的整数，统计个数及总和
		//步骤1：完成输出1-100的值
		//步骤2:在输出过程中过滤，值输出9的倍数 i%9=0
		//步骤3:统计个数，定义一个变量，int count = 0；当条件满足时 count++
		//步骤4：总和。定义一个变量int sum = 0；当条件满足时累计，sum+=
		
		//为了范围灵活 定义起始和重点变量
		//更进一步 把倍数做成变量t
		
		int count = 0;
		int sum = 0;
		int start = 1;
		int end = 100;
		int t = 9;
		for(int i = start ; i<= end; i++) {
			if(i % t == 0) {
				System.out.println("i=" +  i);
				count++;
				sum += i;
			}
		}
		System.out.println("count=" +  count);
		System.out.println("sum=" +  sum);
	}	
}	