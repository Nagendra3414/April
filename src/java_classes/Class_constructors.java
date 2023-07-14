package java_classes;

public class Class_constructors {

	int i; // 0
	String name; // null
	char c; // blank
	boolean b; // false
	float f; // 0.0

	
	//Default Constructor
	public Class_constructors() {
		i = 10;
		name = "Automation";
	}
	
	//Parameterized constructor
	Class_constructors(int a, String b, char cha)
	{
		i = a;
		name = b;
		c = cha;
		
	}
	

	public void method1() {
		System.out.println(i);
		System.out.println(name);
		System.out.println(c);
		System.out.println(b);
		System.out.println(f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_constructors obj = new Class_constructors(400, "SaiLatha", 'G');

		obj.method1();
		
		
		Class_constructors obj1 = new Class_constructors(100, "Testing", 'A');
		
		obj1.method1();
	}

}
