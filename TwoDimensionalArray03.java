public class TwoDimensionalArray03{
	public static void main(String[] args) {
		
		// i = 0: 1
		// i = 1: 2 2
		// i = 2: 3 3 3
		int[][] arr = new int[4][];//创建二维数组，一共有三个一维数组，但是每一个一维数组没有开数据空间
		for(int i = 0; i < arr.length; i++) {
			//给每一个一维数组开空间
			arr[i] = new int[i + 1];
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
				System.out.println();//换行	
		}
	}
}	