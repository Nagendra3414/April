package java_classes;

public class InnrerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 4; i++) // outer loop
		{

			for (int j = i; j < 5; j++) { // inner loop

				System.out.print("*");
			}

			System.out.println("");
		}

	}

}
