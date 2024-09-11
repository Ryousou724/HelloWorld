public class Homework501{
	public static void main(String[] args) {
		
		/*某人有100000元，每经过一个路口，需要交费
		 * 当现金>50000时，每次交5%
		 * 当现金<=50000时，每次1000元
		 * 编程计算该人可经过多少个路口，要求用while + break
		 */
		double money = 100000;
		int count = 1;
		while(true) {
			if(money > 50000) {
				money *= 0.95;
				count ++;
			}else if(money >= 1000) {
				money -= 1000;
				count ++;
			}else {
				break;
			}
		}
		System.out.println("100000可以过" + count + "个路口");
	}
}