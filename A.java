package package1;

public class A {
	String messageA = "Class A"; // instance variable
	// 1.creating a default constructor
	public A() {
	System.out.println(messageA);
	}
	// 2.main method
	public static void main(String[]args) {
	// 3.calling a default constructor
		A objA = new A(); //objA object
		B objB = new B(); //objB object
	}
}
