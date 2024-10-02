public class Method01{
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.speak();
	}
}
class Person1 {
	String name;
	int age;
	public void speak() {
		System.out.println("我是一个好人");
	}
}