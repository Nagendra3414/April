package java_classes;

public class Swicth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switch (30) {
		case 10:
			String[] c = { "ABC", "DEF", "GHI", "XYZ" };
			
			for(int i=0; i<=c.length-1; i++)
			{
				System.out.println(c[i]);
			}
			
			System.out.println("Ten");
			break;

		case 20:
			System.out.println("20");
			break;

		case 30:
			System.out.println("30");
			break;

		}
	}

}
