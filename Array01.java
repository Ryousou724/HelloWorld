public class Array01{
	public static void main(String[] args) {
		
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		System.out.println("数组的长度=" + hens.length);
		double totalWeight = 0;
		for(int i = 0; i < hens.length; i++) {
			totalWeight += hens[i];
		}
		System.out.println("总体重=" + totalWeight + 
				"平均体重=" + (totalWeight/hens.length));
		
	}
}