package java_classes;

public class Class_MethodOverloading {

	int x;
	int y;

	public int add() // Method without arguments
	{
		x = 10;
		y = 20;

		int z = x + y;

		return z;
	}
	

	public int add(int a) {  // Method with one argument
		x = a;
		y = 20;

		int z = x + y;

		return z;

	}

	public int add(int a, int b) {  // Method with two argument
		x = a;
		y = b;

		int z = x + y;

		return z;

	}
	

	public int add(int a, float b) {  // Method with two argument and different arguments
		x = a;
		y = (int) b;

		int z = x + y;

		return z;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_MethodOverloading obj = new Class_MethodOverloading();
		
		
		System.out.println(obj.add());
		System.out.println(obj.add(100));
		System.out.println(obj.add(100, 200));
		System.out.println(obj.add(100, 100.01f));
		
		
	}

}
