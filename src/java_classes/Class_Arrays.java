package java_classes;

public class Class_Arrays {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		
		
		int[] b= new int[5];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		
		
		System.out.println(b.length);
		
		
		System.out.println(b[5]);
		
		String d = "gd";
		String[] c = {"ABC", "DEF", "GHI","XYZ"};
		
		char[] f = {'A', 'g', 'z'};
		

		
		for(int i=0; i<=c.length-1; i++)
		{
			System.out.println(c[i]);
		}
		
		
		for(char temp: f)
		{
			System.out.println(temp);
		}
		
		for(int num :b)
		{
			System.out.println(num);
		}
		
		
		
		
	}

}
