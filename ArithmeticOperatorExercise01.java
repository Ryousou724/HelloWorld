public class ArithmeticOperatorExercise01{
	public static void main(String[] args) {
		
		int i = 1;
		i = i++;//(1)temp=1 (2)i=i++ (3)i=temp
		System.out.println(i);
		
		int j = 1;
		//j = ++j; //(1)j=j++ (2)temp=2 (3)j=temp
		System.out.println(j);
		
		int i1 = 10;
		int i2 = 20;
		int k = i1++;
		System.out.println("k=" + k);
		System.out.println(i2);
		int l = --i2;
		System.out.println("l=" + l);
		System.out.println("i2=" + i2);
		
		
	} 
}