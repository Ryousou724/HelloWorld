public class Overload{
	public static void main(String args) {
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculator(1,2));
		System.out.println(mc.calculator(1.1,2));
		System.out.println(mc.calculator(1,2.2));
	}
}
class MyCalculator{
	public int calculator(int n1, int n2) {
		return n1 + n2;
	}
	public double calculator(int n1, double n2) {
		return n1 + n2;
	}
	public double calculator(double n1, int n2) {
		return n1 + n2;
	}
	public int calculator(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}