package java_classes;

public class Class_this {

	
	String a = "Automation_instance";
	int b =20;
	
	
	public void method1()
	{
		String a = "Automation";
		int b =10;
		
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_this obj = new Class_this();
		
		obj.method1();
	}

}
