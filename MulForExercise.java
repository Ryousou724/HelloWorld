import java.util.Scanner;
public class MulForExercise{
	public static void main(String[] args) {
		
	//统计3个班成绩情况，每个班有五名同学，求出各个班平均分和所有班平均分
	//学生的成绩 键盘输入
	//统计三个班及格人数，每个班有五名同学	
		
		Scanner myScanner = new Scanner(System.in);
		
		double totalScore = 0;
		for(int i = 1; i <=3; i++) {
		double sum = 0;
		int passNum = 0;
		for(int j = 1; j <= 5; j++) {
			System.out.println("请输入第" + i + "个班的第" + j + "个学生的成绩");
			double score = myScanner.nextDouble();
			if(score >= 60) {
				passNum++;
			}
			
			sum += score;
			System.out.println("成绩为" + score);
		}
		
			System.out.println("sum=" + sum + "平均分=" + sum/5);
			totalScore += sum;
			System.out.println("三个班总分=" + totalScore + "三个班平均分=" + totalScore/15);
			System.out.println("及格人数=" + passNum);
	}
	}
}