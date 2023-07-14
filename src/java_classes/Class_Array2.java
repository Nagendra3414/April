package java_classes;

public class Class_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] b = new int[2][3];
		
		int[][] a = { { 1, 2, 3 }, { 7, 8, 9 } };
		
		a[0][0]	=1;
		a[0][1] =2;
		a[0][2] =3;
		
		
		a[1][0]	=7;
		a[1][1] =8;
		a[1][2] =9;
		
//		System.out.println(a.length);
//		
//		
//		System.out.println(a[1][2]);
//		
//		
//		
//		System.out.println(a[0].length);

		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				
				System.out.println(a[i][j]);
			}
		}
		
	}

}
