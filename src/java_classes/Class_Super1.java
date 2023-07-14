package java_classes;

public class Class_Super1 extends Class_Super{

	
	String name = "Testing_child CLASS";
	
	public void getString()
	{
		System.out.println(name);
		
		System.out.println(super.name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_Super1 obj = new Class_Super1();
		
		obj.getString();
	}

}
