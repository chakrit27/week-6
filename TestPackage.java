import package1.A;
import package1.B;

public class TestPackage {
	// 1.properties/variable
	static String message = "Welcome !\n"; // message static variable
	static String name = "Mark Sakaberg";  // name static variable
	static String eat = "Brteakfast";      // eat static variable
	String company = "Facebook coperation";// company instance variable
	// Method constructor of class
	public TestPackage() {
		System.out.println(company + "12");
	}
	
	// 2.activate,behavior,method/function
	public static void main(String[]args) {
		Welcome(message); // 1.Calling method/function Welcome()
		Name(name); // 2.Calling method/function Name()
		Eat(eat); // 3.Calling method/function Eat()
		TestPackage objT = new TestPackage(); // create object variable
		A objA2 = new A();
		B objB2 = new B();
	}
	public static void Welcome(String m) {
		String text = "Hi !"; // local variable
		System.out.print(text + " " + m);
	}
	public static void Name(String n) {
		int age = 32; // age local variable
		System.out.println("Name is :" + n + " Age id : " + age); // statement
	}
	
	// 3.activate,behavior,Sub method/function
	public static void Eat(String e) {
		System.out.println("Food is :" + e);
	}
}
