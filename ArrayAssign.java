public class ArrayAssign{
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		arr2[0] = 10;
		
		System.out.println("====arr1的元素====");
		for(int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
		}	
	}
}	