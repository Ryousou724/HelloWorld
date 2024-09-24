public class BubbleSort{
	public static void main(String[] args) {
		//冒泡排序数组{24,69,80,57,13}
		int[] arr = {24, 69, 80, 57, 13, -1, 30, 200};
		int temp = 0;//用于交换辅助变量
		
		//将多轮排序使用外层循环包裹起来即可
		//4 = arr.length - 1
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < (arr.length - 1) - i; j++) { //4次比较 3  2  1
				//如果前数 > 后数，就交换
				if(arr[j] > arr[j +1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
				System.out.println("\n====第"+(i + 1)+"轮====");
				for(int j = 0; j < arr.length; j++) {
					System.out.print(arr[j] + "\t");
				}
		}
//		//第一轮排序
//		for(int j = 0; j < 4; j++) { //4次比较
//			//如果前数 > 后数，就交换
//			if(arr[j] > arr[j +1]) {
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}
//		System.out.println("====第1轮====");
//		for(int j = 0; j < arr.length; j++) {
//			System.out.print(arr[j] + "\t");
//		}
//		
//		for(int j = 0; j < 3; j++) { //3次比较
//			//如果前数 > 后数，就交换
//			if(arr[j] > arr[j +1]) {
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}
//		System.out.println("\n====第2轮====");
//		for(int j = 0; j < arr.length; j++) {
//			System.out.print(arr[j] + "\t");
//		}
	}
}	