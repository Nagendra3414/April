package java_classes;

public class Class_returnType {

	public int method1() {
		int a = 10;
		int b = 20;
		int c = a + b;

		System.out.println(c);

		return c;
	}

	public void method2(int value) {
		int num = 100;

		int finalvalue = num + value;

		System.out.println(finalvalue);
	}
	
	
	public String method3()
	{
		String name = "Automation";
		
		
		return name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_returnType a = new Class_returnType();

		int d = a.method1();
		
		a.method2(d);

		
		String name123 = a.method3();
		
		System.out.println(name123);
	}

}
