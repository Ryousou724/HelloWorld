public class FloatDetail{
	public static void main(String[] args) {
		float n1 = 1.1f;
		double n2 = 1.1;
		double n3 = 1.1f;
		
		double n4 = .123;
		
		double n5 = 2.1234567851;
		float n6 = 2.1234567851f;
		
		double n7 = 2.7;
		double n8 = 8.1 / 3;
		
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);	
		
		System.out.println(5.12e2);
		System.out.println(5.12e-2);
		
		System.out.println(n5);
		System.out.println(n6);
		
		System.out.println(n7);
		System.out.println(n8);
		
		if(Math.abs(n7 - n8) < 0.00001) {
			System.out.println("差值非常小，认为相等");
		}
	}
}