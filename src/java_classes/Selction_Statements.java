package java_classes;

public class Selction_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	int a =4;
	
	if(a<11)  //condition is true
	{
		System.out.println("a is less than 11");
	}
	else if (a==11)
	{
		System.out.println("a is equal to 11");
	}
	else if(a > 11)
	{
		System.out.println("a is greater than 11");
	}
	else
	{
		System.out.println("Error");
	}
	
	
	
	switch(a)
	{
	
	case 12: 
		System.out.println("Jan");
		break;
		
	case 2:
		System.out.println("Feb");
		break;
	case 3:
		System.out.println("Mar");
		break;
	case 4:
		System.out.println("April");
		break;
	
	
	
	}
	
	
	
	
	
//	else
//	{
//		System.out.println("a is greater than or equal to 11");
//	}
//		
	
	}
}
