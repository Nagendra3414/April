package collections_;

import java.util.HashSet;

public class Set_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(100);

		hs.add(200);
		hs.add(300);

		hs.add(400);
		hs.add(500);

		hs.add(600);
		
		System.out.println(hs);

		hs.add(100);

		hs.add(200);
		hs.add(300);
		
		
		hs.remove(100);
		
		hs.remove(600);
		

		System.out.println(hs);
		
		System.out.println(hs.contains(200));
		System.out.println(hs.contains(100));
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		hs.add(100);

		hs.add(200);
		hs.add(700);

		hs.add(800);
		
		hs2.addAll(hs);
		
		System.out.println(hs2);
		
		
		
		
	}

}
