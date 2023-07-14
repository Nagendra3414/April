package java_classes;

public class Class_002_variables {

	int num1 = 1234; // Instance variable or global varibale

	
	char c = 'Z';
	
	public void method1() {

		int num2 = 1000; // Local variable

		System.out.println(num1);
		System.out.println(num2);

	}
	public void method2() {

		String name = "Testing";
		System.out.println(num1);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_002_variables a = new Class_002_variables();
		
		a.method1();
		a.method2();
		
		System.out.println(a.c);
		
	}

}
