package java_classes;

public class Iterative_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i =10;
//		
//		while (i < 3) {
//			System.out.println("Automation");
//
//			i++; // 1 //2 //3
//		}
//		
//	
//
//		do {
//			System.out.println(i);
//
//			i++;
//		} while (i < 5);
//		

		for (int i = 10; i >= 0; i--) {

			if (i == 5) {
				continue;
			}

			System.out.println(i);

		}
		
		
		for (int i = 10; i >= 0; i--) {

			if (i == 5) {
				break;
			}

			System.out.println(i);

		}

	}

}
