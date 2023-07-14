package java_classes;

public class Runner_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Class_Child child = new Class_Child();
		child.display();
		
		Class_parent parent = new Class_parent();
		parent.display();
		
		Class_parent obj = new Class_Child(); //We are creating object to parent class but executing the child class method beacause of method overriding
		
		obj.display();
		
		
	}

}
