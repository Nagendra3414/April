package pack2;

public class Class_Protected {

	protected String user = "User1";

	protected void method1() {
		System.out.println(user);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_Protected a = new Class_Protected();
		
		a.method1();
	}

}
