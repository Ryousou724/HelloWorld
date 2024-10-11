public class Constructor01{
	public static void main(String[] args) {
		
		Person p1 = new Person("smith", 80);
		System.out.println("p1的信息如下");
		System.out.println("p1对象name=" + p1.name);
	}
}
class Person{
	String name;
	int age;
	
	public Person(String Pname, int Page) {
		System.out.println("构造器被调用～");
		name = Pname;
		age = Page;
		
	}
	
}