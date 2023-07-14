package pack2;

public class Class_private {
	
	private String password = "aUTOMATION";
	String username = "Testing";
	
	private void method1()
	{
		System.out.println(password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_private a = new Class_private();
		
		a.method1();
	}

}
