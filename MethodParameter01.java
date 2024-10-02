public class MethodParameter01{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		AAA obj = new AAA();
		obj.swap(a,b);
		System.out.println("a=" + a + "b=" + b);//a=10 b=20
	}
}	
class AAA {
	public void swap(int a, int b) {
		System.out.println("\na和b交换前的值\na=" + a +"\tb=" + b);
		int temp  = a;
		a = b;
		b = temp;
		System.out.println("\na和b交换后的值\na=" + a +"\tb=" + b);

	}
}